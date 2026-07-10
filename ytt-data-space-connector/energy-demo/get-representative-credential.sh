#!/usr/bin/env bash

set -euo pipefail

KC_HOST='keycloak-consumer.127.0.0.1.nip.io'
KC_BASE="https://${KC_HOST}:8443"
SECRET_DIR="$HOME/DSSC_projects/energy-demo/secrets"
CREDENTIAL_FILE="${SECRET_DIR}/representative-credential.jwt"

mkdir -p "$SECRET_DIR"
chmod 700 "$SECRET_DIR"

TMP_DIR=$(mktemp -d)
trap 'rm -rf "$TMP_DIR"' EXIT

curl_local() {
  curl -sk \
    --resolve "${KC_HOST}:8443:127.0.0.1" \
    "$@"
}

echo "1/5 登录 Consumer Keycloak"

LOGIN_HTTP=$(
  curl_local \
    -o "${TMP_DIR}/login.json" \
    -w '%{http_code}' \
    -X POST \
    "${KC_BASE}/realms/test-realm/protocol/openid-connect/token" \
    -H 'Content-Type: application/x-www-form-urlencoded' \
    --data-urlencode 'grant_type=password' \
    --data-urlencode 'client_id=account-console' \
    --data-urlencode 'username=representative' \
    --data-urlencode 'password=test' \
    --data-urlencode 'scope=openid'
)

if [ "$LOGIN_HTTP" != "200" ]; then
  echo "Keycloak 登录失败，HTTP ${LOGIN_HTTP}"
  jq . "${TMP_DIR}/login.json"
  exit 1
fi

ACCESS_TOKEN=$(
  jq -r '.access_token // empty' "${TMP_DIR}/login.json"
)

if [ -z "$ACCESS_TOKEN" ]; then
  echo "登录响应中没有 access_token"
  jq . "${TMP_DIR}/login.json"
  exit 1
fi

echo "2/5 创建 Credential Offer"

OFFER_LOCATION_HTTP=$(
  curl_local \
    -o "${TMP_DIR}/offer-location.json" \
    -w '%{http_code}' \
    "${KC_BASE}/realms/test-realm/protocol/oid4vc/create-credential-offer?credential_configuration_id=user-credential&pre_authorized=true" \
    -H "Authorization: Bearer ${ACCESS_TOKEN}"
)

if [ "$OFFER_LOCATION_HTTP" != "200" ]; then
  echo "Credential Offer 创建失败，HTTP ${OFFER_LOCATION_HTTP}"
  jq . "${TMP_DIR}/offer-location.json"
  exit 1
fi

CREDENTIAL_ISSUER=$(
  jq -r '.issuer // empty' "${TMP_DIR}/offer-location.json" |
  sed "s#https://${KC_HOST}#https://${KC_HOST}:8443#" |
  sed 's/:8443:8443/:8443/'
)

OFFER_NONCE=$(
  jq -r '.nonce // empty' "${TMP_DIR}/offer-location.json"
)

if [ -z "$CREDENTIAL_ISSUER" ] || [ -z "$OFFER_NONCE" ]; then
  echo "Offer 地址或 nonce 缺失"
  jq . "${TMP_DIR}/offer-location.json"
  exit 1
fi

OFFER_URI="${CREDENTIAL_ISSUER}/${OFFER_NONCE}"

echo "3/5 读取 Credential Offer"

OFFER_HTTP=$(
  curl_local \
    -o "${TMP_DIR}/offer.json" \
    -w '%{http_code}' \
    "$OFFER_URI" \
    -H "Authorization: Bearer ${ACCESS_TOKEN}"
)

if [ "$OFFER_HTTP" != "200" ]; then
  echo "Credential Offer 读取失败，HTTP ${OFFER_HTTP}"
  jq . "${TMP_DIR}/offer.json" 2>/dev/null ||
  cat "${TMP_DIR}/offer.json"
  exit 1
fi

PRE_AUTHORIZED_CODE=$(
  jq -r '
    .grants[
      "urn:ietf:params:oauth:grant-type:pre-authorized_code"
    ][
      "pre-authorized_code"
    ] // empty
  ' "${TMP_DIR}/offer.json"
)

if [ -z "$PRE_AUTHORIZED_CODE" ]; then
  echo "没有取得 pre-authorized code"
  jq . "${TMP_DIR}/offer.json"
  exit 1
fi

echo "4/5 换取 Credential Access Token"

TOKEN_HTTP=$(
  curl_local \
    -o "${TMP_DIR}/credential-token.json" \
    -w '%{http_code}' \
    -X POST \
    "${KC_BASE}/realms/test-realm/protocol/openid-connect/token" \
    -H 'Content-Type: application/x-www-form-urlencoded' \
    --data-urlencode \
      'grant_type=urn:ietf:params:oauth:grant-type:pre-authorized_code' \
    --data-urlencode \
      "pre-authorized_code=${PRE_AUTHORIZED_CODE}"
)

if [ "$TOKEN_HTTP" != "200" ]; then
  echo "Credential Access Token 获取失败，HTTP ${TOKEN_HTTP}"
  jq . "${TMP_DIR}/credential-token.json"
  exit 1
fi

CREDENTIAL_ACCESS_TOKEN=$(
  jq -r '.access_token // empty' \
    "${TMP_DIR}/credential-token.json"
)

CREDENTIAL_IDENTIFIER=$(
  jq -r '
    .authorization_details[0].credential_identifiers[0]
    // .credential_identifiers[0]
    // empty
  ' "${TMP_DIR}/credential-token.json"
)

if [ -z "$CREDENTIAL_ACCESS_TOKEN" ]; then
  echo "响应中没有 Credential Access Token"
  jq . "${TMP_DIR}/credential-token.json"
  exit 1
fi

if [ -z "$CREDENTIAL_IDENTIFIER" ]; then
  echo "响应中没有 credential_identifier"
  jq . "${TMP_DIR}/credential-token.json"
  exit 1
fi

echo "Credential Identifier：${CREDENTIAL_IDENTIFIER}"
echo "5/5 请求 Verifiable Credential"

CREDENTIAL_HTTP=$(
  curl_local \
    -o "${TMP_DIR}/credential.json" \
    -w '%{http_code}' \
    -X POST \
    "${KC_BASE}/realms/test-realm/protocol/oid4vc/credential" \
    -H 'Accept: application/json' \
    -H 'Content-Type: application/json' \
    -H "Authorization: Bearer ${CREDENTIAL_ACCESS_TOKEN}" \
    --data "{
      \"credential_identifier\": \"${CREDENTIAL_IDENTIFIER}\"
    }"
)

if [ "$CREDENTIAL_HTTP" != "200" ]; then
  echo "Verifiable Credential 获取失败，HTTP ${CREDENTIAL_HTTP}"
  jq . "${TMP_DIR}/credential.json"
  exit 1
fi

USER_CREDENTIAL=$(
  jq -r '
    .credentials[0].credential
    // .credential
    // empty
  ' "${TMP_DIR}/credential.json"
)

if [ -z "$USER_CREDENTIAL" ]; then
  echo "响应中没有 Credential"
  jq . "${TMP_DIR}/credential.json"
  exit 1
fi

printf '%s' "$USER_CREDENTIAL" > "$CREDENTIAL_FILE"
chmod 600 "$CREDENTIAL_FILE"

echo "Verifiable Credential 获取成功"
echo "Credential 长度：${#USER_CREDENTIAL}"
echo "已安全保存到：${CREDENTIAL_FILE}"
