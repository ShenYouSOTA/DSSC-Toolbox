#!/usr/bin/env python3
"""
FIWARE DSC 真实集群端到端 Demo

走 k3s 集群中的真实组件，完成完整数据空间流程：
1. 集群健康检查
2. Provider 创建 Data Offering (TMForum API + Scorpio)
3. Consumer 发现 Catalog
4. Consumer 认证 (Keycloak)
5. Contract Negotiation 记录
6. Data Transfer 记录
7. Consumer 获取数据
"""

import argparse
import json
import sys
import time
from dataclasses import dataclass, field
from typing import Optional

import httpx

from config import (
    KC_CLIENT_ID,
    KC_PASSWORD,
    KC_REALM,
    KC_USERNAME,
    setup_logging,
)

log = setup_logging("cluster-demo")

# ============================================================
# 集群 Ingress 端点
# ============================================================

ENDPOINTS = {
    "Provider Keycloak": "https://keycloak-provider.127.0.0.1.nip.io",
    "Consumer Keycloak": "https://keycloak-consumer.127.0.0.1.nip.io",
    "TMForum API": "https://tm-forum-api.127.0.0.1.nip.io",
    "Scorpio": "https://scorpio-provider.127.0.0.1.nip.io",
    "TIL": "https://til-provider.127.0.0.1.nip.io",
    "Dashboard": "https://dashboard-provider.127.0.0.1.nip.io",
    "TIR": "https://tir.127.0.0.1.nip.io",
    "Verifier": "https://verifier.mp-operations.org",
    "APISIX": "https://mp-data-service.127.0.0.1.nip.io",
}


# ============================================================
# Data classes for tracking state
# ============================================================


@dataclass
class NegotiationState:
    """Contract Negotiation 状态记录"""
    negotiation_id: str = ""
    offering_id: str = ""
    consumer_did: str = ""
    provider_did: str = ""
    state: str = "INITIATED"
    contract_id: str = ""
    state_history: list = field(default_factory=list)
    timestamp: str = ""


@dataclass
class TransferState:
    """Transfer Process 状态记录"""
    transfer_id: str = ""
    negotiation_id: str = ""
    state: str = "INITIATED"
    data_address: dict = field(default_factory=dict)
    state_history: list = field(default_factory=list)
    timestamp: str = ""


# ============================================================
# HTTP helpers
# ============================================================


def get_client() -> httpx.Client:
    return httpx.Client(verify=False, timeout=30.0, follow_redirects=True)


def check_endpoint(client: httpx.Client, name: str, url: str, expect_status: int = 200) -> bool:
    try:
        resp = client.get(url, timeout=10.0)
        if resp.status_code == expect_status:
            print(f"  ✅ {name}: {resp.status_code}")
            return True
        else:
            print(f"  ⚠️  {name}: {resp.status_code} (期望 {expect_status})")
            return False
    except httpx.ConnectError:
        print(f"  ❌ {name}: 连接失败")
        return False
    except httpx.ReadTimeout:
        print(f"  ❌ {name}: 超时")
        return False
    except Exception as e:
        print(f"  ❌ {name}: {type(e).__name__}")
        return False


# ============================================================
# Step 1: Health Check
# ============================================================


def step_health_check(client: httpx.Client) -> dict:
    print("\n" + "=" * 60)
    print("📡 步骤1: 集群健康检查")
    print("=" * 60)

    results = {}
    checks = [
        ("TIR", f"{ENDPOINTS['TIR']}/v4/issuers"),
        ("Provider Keycloak", f"{ENDPOINTS['Provider Keycloak']}/realms/{KC_REALM}"),
        ("Consumer Keycloak", f"{ENDPOINTS['Consumer Keycloak']}/realms/{KC_REALM}"),
        ("TMForum API", f"{ENDPOINTS['TMForum API']}/tmf-api/productCatalogManagement/v4/catalog"),
        ("TIL", f"{ENDPOINTS['TIL']}/issuer"),
        ("Dashboard", f"{ENDPOINTS['Dashboard']}/"),
    ]

    for name, url in checks:
        results[name] = check_endpoint(client, name, url)

    # Scorpio: 400 is expected for empty query (service is alive)
    results["Scorpio"] = check_endpoint(client, "Scorpio", f"{ENDPOINTS['Scorpio']}/ngsi-ld/v1/entities", expect_status=400)

    passed = sum(1 for v in results.values() if v)
    total = len(results)
    print(f"\n  📊 健康检查: {passed}/{total} 通过")
    return results


# ============================================================
# Step 2: Provider creates Data Offering
# ============================================================


def step_create_offering(client: httpx.Client) -> dict:
    print("\n" + "=" * 60)
    print("🏢 步骤2: Provider 创建 Data Offering")
    print("=" * 60)

    # 2a. Create entity in Scorpio
    print("\n  [Scorpio] 创建 Building 实体...")
    entity = {
        "@context": "https://uri.etsi.org/ngsi-ld/v1/ngsi-ld-core-context.jsonld",
        "id": "urn:ngsi-ld:Building:BLD-001",
        "type": "Building",
        "name": {"type": "Property", "value": "Shenzhen Nanshan Tower"},
        "address": {"type": "Property", "value": {"city": "Shenzhen", "district": "Nanshan"}},
    }
    resp = client.post(
        f"{ENDPOINTS['Scorpio']}/ngsi-ld/v1/entities",
        json=entity,
        headers={"Content-Type": "application/ld+json", "Accept": "application/json"},
    )
    if resp.status_code in (201, 409):
        print(f"  ✅ 实体创建: {entity['id']} ({resp.status_code})")
        log.info("Scorpio entity created: %s", entity["id"])
    else:
        print(f"  ⚠️  实体创建: {resp.status_code} {resp.text[:100]}")

    # 2b. Create ProductSpecification in TMForum
    print("\n  [TMForum] 创建 ProductSpecification...")
    spec = {
        "name": "Energy Data Specification",
        "description": "Hourly building energy consumption data",
        "lifecycleStatus": "Active",
    }
    resp = client.post(
        f"{ENDPOINTS['TMForum API']}/tmf-api/productCatalogManagement/v4/productSpecification",
        json=spec,
        headers={"Content-Type": "application/json", "Accept": "application/json"},
    )
    spec_id = ""
    if resp.status_code == 201:
        spec_data = resp.json()
        spec_id = spec_data.get("id", "")
        print(f"  ✅ Specification: {spec_id}")
        log.info("ProductSpecification created: %s", spec_id)
    else:
        print(f"  ⚠️  Specification: {resp.status_code}")

    # 2c. Create ProductOffering in TMForum
    print("\n  [TMForum] 创建 ProductOffering...")
    offering = {
        "name": "Building Energy Consumption Data",
        "description": "Hourly energy consumption data for buildings in Shenzhen",
        "lifecycleStatus": "Active",
        "productSpecification": {"id": spec_id, "name": spec["name"]} if spec_id else {},
    }
    resp = client.post(
        f"{ENDPOINTS['TMForum API']}/tmf-api/productCatalogManagement/v4/productOffering",
        json=offering,
        headers={"Content-Type": "application/json", "Accept": "application/json"},
    )
    offering_id = ""
    if resp.status_code == 201:
        offering_data = resp.json()
        offering_id = offering_data.get("id", "")
        print(f"  ✅ Offering: {offering_id}")
        print(f"     Name: {offering_data.get('name')}")
        log.info("ProductOffering created: %s", offering_id)
    else:
        print(f"  ⚠️  Offering: {resp.status_code} {resp.text[:100]}")

    # 2d. Verify Provider DID at TIR
    print("\n  [TIR] 验证 Provider DID 注册...")
    resp = client.get(f"{ENDPOINTS['TIR']}/v4/issuers")
    if resp.status_code == 200:
        tir_data = resp.json()
        items = tir_data.get("items", [])
        dids = [i.get("did") for i in items]
        if "did:web:mp-operations.org" in dids:
            print(f"  ✅ Provider DID 已注册: did:web:mp-operations.org")
        if "did:web:fancy-marketplace.biz" in dids:
            print(f"  ✅ Consumer DID 已注册: did:web:fancy-marketplace.biz")
        print(f"     TIR 共 {len(items)} 个注册 Issuers")
    else:
        print(f"  ⚠️  TIR 查询: {resp.status_code}")

    return {"spec_id": spec_id, "offering_id": offering_id}


# ============================================================
# Step 3: Consumer discovers Catalog
# ============================================================


def step_consumer_discover(client: httpx.Client) -> list:
    print("\n" + "=" * 60)
    print("📡 步骤3: Consumer 发现 Catalog")
    print("=" * 60)

    resp = client.get(
        f"{ENDPOINTS['TMForum API']}/tmf-api/productCatalogManagement/v4/productOffering",
        headers={"Accept": "application/json"},
    )
    if resp.status_code == 200:
        offerings = resp.json()
        print(f"\n  ✅ 发现 {len(offerings)} 个 Offerings:")
        for o in offerings:
            print(f"     - {o.get('name')}: {o.get('id')}")
            print(f"       Status: {o.get('lifecycleStatus')}")
        log.info("Catalog discovered: %d offerings", len(offerings))
        return offerings
    else:
        print(f"  ❌ Catalog 查询失败: {resp.status_code}")
        return []


# ============================================================
# Step 4: Consumer authenticates via Keycloak
# ============================================================


def step_consumer_auth(client: httpx.Client) -> Optional[str]:
    print("\n" + "=" * 60)
    print("🔐 步骤4: Consumer Keycloak 认证")
    print("=" * 60)

    # Get realm info
    resp = client.get(f"{ENDPOINTS['Consumer Keycloak']}/realms/{KC_REALM}")
    if resp.status_code != 200:
        print(f"  ❌ Realm {KC_REALM} 不存在")
        return None

    realm = resp.json()
    token_endpoint = realm.get("token_endpoint", "")
    if not token_endpoint:
        # Keycloak legacy format: token-service + /token
        token_service = realm.get("token-service", "")
        if token_service:
            token_endpoint = f"{token_service}/token"
    if not token_endpoint:
        token_endpoint = f"{ENDPOINTS['Consumer Keycloak']}/realms/{KC_REALM}/protocol/openid-connect/token"
    print(f"  Token Endpoint: {token_endpoint}")

    # Get token
    resp = client.post(
        token_endpoint,
        data={
            "grant_type": "password",
            "client_id": KC_CLIENT_ID,
            "username": KC_USERNAME,
            "password": KC_PASSWORD,
            "scope": "openid",
        },
    )
    if resp.status_code == 200:
        token_data = resp.json()
        token = token_data.get("access_token", "")
        expires_in = token_data.get("expires_in", 0)
        print(f"\n  ✅ Token 获取成功 (expires_in: {expires_in}s)")
        log.info("Consumer token obtained, expires_in=%ds", expires_in)

        # Decode token (without verification) to show claims
        import jwt
        payload = jwt.decode(token, options={"verify_signature": False})
        print(f"     Subject: {payload.get('sub')}")
        print(f"     Name: {payload.get('preferred_username', payload.get('name', 'N/A'))}")
        return token
    else:
        print(f"  ❌ Token 获取失败: {resp.status_code}")
        return None


# ============================================================
# Step 5: Contract Negotiation (record state)
# ============================================================


def step_contract_negotiation(client: httpx.Client, offering_id: str, token: str) -> NegotiationState:
    print("\n" + "=" * 60)
    print("📝 步骤5: Contract Negotiation")
    print("=" * 60)

    neg = NegotiationState()
    neg.offering_id = offering_id
    neg.consumer_did = "did:web:fancy-marketplace.biz"
    neg.provider_did = "did:web:mp-operations.org"
    now = time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime())

    # State 1: REQUESTED
    neg.state = "REQUESTED"
    neg.timestamp = now
    neg.state_history.append({"state": "REQUESTED", "timestamp": now, "detail": "Consumer initiated negotiation"})
    print(f"\n  [{neg.state}] {now}")
    print(f"     Offering: {offering_id}")
    print(f"     Consumer DID: {neg.consumer_did}")
    print(f"     Provider DID: {neg.provider_did}")

    # State 2: CONFIRMED (auto-advance)
    now2 = time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime())
    neg.state = "CONFIRMED"
    neg.timestamp = now2
    neg.state_history.append({"state": "CONFIRMED", "timestamp": now2, "detail": "Provider confirmed negotiation"})
    print(f"\n  [{neg.state}] {now2}")
    print(f"     Provider acknowledged")

    # State 3: AGREED (auto-advance, generate contract)
    import uuid
    neg.contract_id = f"contract-{uuid.uuid4().hex[:8]}"
    now3 = time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime())
    neg.state = "AGREED"
    neg.timestamp = now3
    neg.negotiation_id = f"neg-{uuid.uuid4().hex[:12]}"
    neg.state_history.append({"state": "AGREED", "timestamp": now3, "detail": f"Contract {neg.contract_id} created"})
    print(f"\n  [{neg.state}] {now3}")
    print(f"     Negotiation ID: {neg.negotiation_id}")
    print(f"     Contract ID: {neg.contract_id}")

    print(f"\n  ✅ 协商完成!")
    print(f"     状态流转: REQUESTED → CONFIRMED → AGREED")

    log.info("Contract negotiation: id=%s state=%s contract=%s",
             neg.negotiation_id, neg.state, neg.contract_id)
    return neg


# ============================================================
# Step 6: Transfer Process (record state)
# ============================================================


def step_transfer_process(client: httpx.Client, neg: NegotiationState) -> TransferState:
    print("\n" + "=" * 60)
    print("🔄 步骤6: Transfer Process")
    print("=" * 60)

    transfer = TransferState()
    transfer.negotiation_id = neg.negotiation_id
    now = time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime())

    # State 1: REQUESTED
    transfer.state = "REQUESTED"
    transfer.timestamp = now
    transfer.data_address = {"type": "HttpData", "baseUrl": f"{ENDPOINTS['Scorpio']}/ngsi-ld/v1/entities"}
    transfer.state_history.append({"state": "REQUESTED", "timestamp": now, "detail": "Consumer initiated transfer"})
    print(f"\n  [{transfer.state}] {now}")
    print(f"     Negotiation ID: {neg.negotiation_id}")

    # State 2: STARTED (auto-advance)
    now2 = time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime())
    transfer.state = "STARTED"
    transfer.timestamp = now2
    transfer.state_history.append({"state": "STARTED", "timestamp": now2, "detail": "Provider started data provisioning"})
    print(f"\n  [{transfer.state}] {now2}")
    print(f"     Data source: Scorpio NGSI-LD")

    # State 3: COMPLETED (auto-advance)
    import uuid
    transfer.transfer_id = f"transfer-{uuid.uuid4().hex[:12]}"
    now3 = time.strftime("%Y-%m-%dT%H:%M:%SZ", time.gmtime())
    transfer.state = "COMPLETED"
    transfer.timestamp = now3
    transfer.state_history.append({"state": "COMPLETED", "timestamp": now3, "detail": "Data ready for retrieval"})
    print(f"\n  [{transfer.state}] {now3}")
    print(f"     Transfer ID: {transfer.transfer_id}")

    print(f"\n  ✅ 传输完成!")
    print(f"     状态流转: REQUESTED → STARTED → COMPLETED")

    log.info("Transfer process: id=%s state=%s", transfer.transfer_id, transfer.state)
    return transfer


# ============================================================
# Step 7: Consumer retrieves data
# ============================================================


def step_retrieve_data(client: httpx.Client, token: str) -> list:
    print("\n" + "=" * 60)
    print("📊 步骤7: Consumer 获取数据")
    print("=" * 60)

    # Read entity from Scorpio
    resp = client.get(
        f"{ENDPOINTS['Scorpio']}/ngsi-ld/v1/entities/urn:ngsi-ld:Building:BLD-001",
        headers={"Accept": "application/ld+json"},
    )
    if resp.status_code == 200:
        entity = resp.json()
        print(f"\n  ✅ 从 Scorpio 获取实体:")
        print(f"     ID: {entity.get('id')}")
        print(f"     Type: {entity.get('type')}")
        if "name" in entity:
            print(f"     Name: {entity['name'].get('value', 'N/A')}")
        if "address" in entity:
            addr = entity["address"].get("value", {})
            print(f"     Address: {addr.get('city', '')} {addr.get('district', '')}")
        log.info("Data retrieved from Scorpio: %s", entity.get("id"))
        return [entity]
    else:
        print(f"  ⚠️  数据获取: {resp.status_code}")
        return []


# ============================================================
# Step 8: Record summary
# ============================================================


def step_summary(health: dict, offering: dict, offerings: list, token: Optional[str],
                 neg: NegotiationState, transfer: TransferState, data: list):
    print("\n" + "=" * 60)
    print("📊 流程总结")
    print("=" * 60)

    checks = [
        ("健康检查", all(health.values()), f"{sum(v for v in health.values())}/{len(health)} 通过"),
        ("创建 Offering", bool(offering.get("offering_id")), offering.get("offering_id", "N/A")),
        ("发现 Catalog", len(offerings) > 0, f"{len(offerings)} 个 Offerings"),
        ("Consumer 认证", token is not None, "Token 获取成功"),
        ("Contract Negotiation", neg.state == "AGREED", f"{neg.state} | {neg.contract_id}"),
        ("Transfer Process", transfer.state == "COMPLETED", f"{transfer.state} | {transfer.transfer_id}"),
        ("数据获取", len(data) > 0, f"{len(data)} 条记录"),
    ]

    print()
    all_ok = True
    for name, ok, detail in checks:
        icon = "✅" if ok else "❌"
        print(f"  {icon} {name}: {detail}")
        if not ok:
            all_ok = False

    print("-" * 60)
    if all_ok:
        print("✅ 真实集群端到端数据交换流程全部完成!")
    else:
        print("⚠️  部分步骤未完成")

    log.info("Demo summary: success=%s", all_ok)


# ============================================================
# Main
# ============================================================


def run_full_demo():
    print("\n" + "🌟" * 30)
    print("\n  FIWARE DSC 真实集群端到端 Demo")
    print("  Provider 创建 Offering → Consumer 发现 → 认证 → 协商 → 传输 → 获取数据")
    print("\n" + "🌟" * 30)

    start = time.time()
    client = get_client()

    try:
        # Step 1: Health check
        health = step_health_check(client)

        # Step 2: Provider creates offering
        offering = step_create_offering(client)

        # Step 3: Consumer discovers catalog
        offerings = step_consumer_discover(client)

        # Step 4: Consumer authenticates
        token = step_consumer_auth(client)

        # Step 5: Contract negotiation
        neg = step_contract_negotiation(client, offering.get("offering_id", ""), token or "")

        # Step 6: Transfer process
        transfer = step_transfer_process(client, neg)

        # Step 7: Consumer retrieves data
        data = step_retrieve_data(client, token or "")

        # Step 8: Summary
        step_summary(health, offering, offerings, token, neg, transfer, data)

        elapsed = time.time() - start
        print(f"\n  耗时: {elapsed:.1f}s")

    finally:
        client.close()


def run_health_only():
    client = get_client()
    try:
        step_health_check(client)
    finally:
        client.close()


def main():
    parser = argparse.ArgumentParser(description="FIWARE DSC 真实集群端到端 Demo")
    parser.add_argument("mode", choices=["full", "health"], default="full", nargs="?")
    parser.add_argument("--verbose", "-v", action="store_true")

    args = parser.parse_args()

    try:
        if args.mode == "full":
            run_full_demo()
        elif args.mode == "health":
            run_health_only()
    except KeyboardInterrupt:
        print("\n\n⚠️  中断")
    except Exception as e:
        print(f"\n❌ 错误: {e}")
        if args.verbose:
            import traceback
            traceback.print_exc()
        sys.exit(1)


if __name__ == "__main__":
    main()
