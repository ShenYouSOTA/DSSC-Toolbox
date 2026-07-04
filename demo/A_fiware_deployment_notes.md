# FIWARE DSC 部署笔记

本文档记录 FIWARE Data Space Connector (DSC) 在 k3s 本地环境中的完整部署过程，包括踩坑记录、技术选型分析和配置参考。

---

## 1. 环境与前置条件

### 硬件要求

| 资源 | 最低要求 | 推荐配置 |
|------|---------|---------|
| 内存 | 16 GB | ≥ 24 GB |
| CPU | 4 核 | 8 核 |
| 磁盘 | 10 GB | SSD 优先 |
| 操作系统 | Linux / macOS | Ubuntu |

### 必需工具

| 工具 | 版本 | 用途 |
|------|------|------|
| Docker | 27.0+ | 运行 k3s 容器 |
| kubectl | latest | Kubernetes 管理 |
| helm | 3.x | Chart 部署 |
| Python | 3.10+ | Demo 运行 |
| uv | latest | Python 包管理 |

### k3s 集群启动

```bash
# 启动 k3s (Docker 方式, 禁用 traefik)
docker run -d --name k3s-server \
    --privileged \
    -p 6443:6443 \
    -p 80:80 \
    -p 443:443 \
    -v k3s-data:/var/lib/rancher/k3s \
    rancher/k3s:latest server \
    --disable=traefik

# 获取 kubeconfig
docker exec k3s-server cat /etc/rancher/k3s/k3s.yaml > /tmp/k3s.yaml
export KUBECONFIG=/tmp/k3s.yaml
```

---

## 2. 技术选型

### 2.1 官方约束（FDSC Helm Chart 强制要求）

以下组件由 FIWARE DSC 的 Helm Umbrella Chart 定义，部署时无法绕过：

| 组件 | 作用 | 说明 |
|------|------|------|
| **Keycloak** | OIDC Provider / 凭证签发 | CloudPirates 维护的 patched 版本 (26.6.2) |
| **MongoDB** | Scorpio Context Broker 后端 | NGSI-LD 实体存储 |
| **PostgreSQL** | TMForum / Keycloak / Verifier 后端 | 关系型数据存储 |
| **cert-manager** | TLS 证书自动签发 | 所有 Ingress 的 HTTPS 依赖 |
| **APISIX** | API Gateway / PEP | 策略执行点，与 OPA 联动 |
| **OPA** | 策略决策点 (PDP) | 执行 ODRL 策略 |
| **ODRL-PAP** | 策略管理点 | ODRL 策略存储与加载 |
| **VCVerifier** | 凭证验证 | OID4VP 认证端点 |
| **DID Helper** | 去中心化身份 | `did:web` 文档服务 |
| **TMForum API** | 产品目录管理 | ProductSpecification / ProductOffering |
| **Scorpio** | NGSI-LD Context Broker | 数据服务 (Quarkus/Java) |

**数据模型约束：**
- 数据必须以 NGSI-LD 格式存储到 Scorpio
- 产品目录必须通过 TMForum Open API 管理
- 认证必须走 OID4VP / Verifiable Credentials 流程
- DID 必须注册到 Trusted Issuers Registry (TIR)

### 2.2 自选方案（本项目选择）

以下选择是本项目为本地开发演示而做的决策，非 FDSC 官方要求：

| 决策点 | 选择 | 理由 | 替代方案 |
|--------|------|------|---------|
| **容器编排** | k3s (Docker 容器) | 轻量、启动快、资源占用少 | minikube, kind, 裸机 k8s |
| **Ingress Controller** | nginx-ingress | 社区成熟、配置灵活 | traefik (k3s 默认) |
| **k3s 启动参数** | `--disable=traefik` | 避免与 nginx-ingress 端口冲突 | 不禁用，只装一个 |
| **域名解析** | nip.io (`*.127.0.0.1.nip.io`) | 无需修改 /etc/hosts，自动解析到 127.0.0.1 | CoreDNS 配置, /etc/hosts |
| **PostgreSQL Operator** | Zalando postgres-operator | FDSC Chart 内置支持 | CloudNativePG |
| **Demo 语言** | Python (FastAPI + httpx) | 开发速度快、依赖轻量 | Java (官方 SDK), Go |
| **包管理** | uv | 极速依赖解析 | pip, poetry |
| **自动化** | justfile | 语义清晰、易维护 | Makefile, shell 脚本 |
| **配置管理** | config.py 集中配置 | 类型安全、IDE 补全 | .env 文件, YAML |

### 2.3 命名空间划分

```
trust-anchor/     → TIR (Trusted Issuers Registry)
provider/         → Keycloak, Verifier, MongoDB, PostgreSQL, Scorpio, TMForum, APISIX, Dashboard
consumer/         → Keycloak, PostgreSQL
ingress-nginx/    → nginx-ingress-controller
cert-manager/     → cert-manager
postgres-operator/→ Zalando PostgreSQL Operator
```

---

## 3. 部署流程（按依赖顺序）

```bash
# 一键启动全部
just up

# 或手动分步：
just k3s-start && just k3s-wait
just deploy-infra        # cert-manager + postgres-operator
just deploy-apps         # trust-anchor + provider + consumer
just smoke-test
```

### 3.1 基础设施层（必须先于应用部署）

```bash
# 1. cert-manager (TLS 证书签发)
helm install cert-manager jetstack/cert-manager \
    --namespace cert-manager --create-namespace \
    --set crds.enabled=true --wait --timeout 5m

# 2. Zalando PostgreSQL Operator (数据库管理)
helm install postgres-operator postgres-operator/postgres-operator \
    --namespace postgres-operator --create-namespace \
    --wait --timeout 5m
```

### 3.2 应用层

```bash
# 3. Trust Anchor (TIR)
helm install trust-anchor charts/trust-anchor \
    -f k3s/trust-anchor.yaml \
    --namespace trust-anchor --create-namespace --wait --timeout 5m

# 4. Provider (完整数据空间提供者)
helm install provider charts/data-space-connector \
    -f k3s/provider.yaml \
    --namespace provider --create-namespace --wait --timeout 10m

# 5. Consumer (消费者角色)
kubectl create secret generic keystore-password \
    --from-literal=password=changeit -n consumer
helm install consumer charts/data-space-connector \
    -f k3s/consumer.yaml \
    --namespace consumer --create-namespace --wait --timeout 10m
```

### 3.3 Ingress 配置

```bash
# 6. nginx-ingress-controller
helm install ingress-nginx ingress-nginx/ingress-nginx \
    --namespace ingress-nginx --create-namespace

# 7. 为所有 Ingress 添加 ingressClassName
kubectl get ingress -A -o name | xargs -I {} kubectl patch {} \
    --type merge -p '{"spec":{"ingressClassName":"nginx"}}'
```

---

## 4. 踩坑记录

### 4.1 镜像拉取超时

**现象：** MongoDB Pod 处于 `ImagePullBackOff` 状态，`quay.xuanyuan.me` 镜像拉取超时。

**根因：** `quay.xuanyuan.me` 是国内镜像代理，网络不稳定时会超时。`docker.io/fiware/biz-ecosystem-charging-backend:11.3.1` 同样受限于 Docker Hub 速率限制。

**解决方案：**
- 等待网络恢复后重试
- 使用其他镜像代理（如 `docker.1ms.run`）
- 预先 `docker pull` 镜像后导入 k3s 容器

**验证命令：**
```bash
kubectl get pods -n provider | grep -E "ImagePull|ErrImage"
```

---

### 4.2 CRD 缺失

**现象：** Provider 部署时 Pod 卡在 `Pending`，事件显示 `persistentvolumeclaim not found` 或 `CRD not found`。

**根因：** FDSC Chart 依赖 Zalando PostgreSQL Operator 的 CRD（如 `postgresql`）和 MongoDB Operator 的 CRD。这些 Operator 未预装。

**解决方案：**
```bash
# 安装 Zalando PostgreSQL Operator
helm install postgres-operator postgres-operator/postgres-operator \
    --namespace postgres-operator --create-namespace

# MongoDB: 使用 managedMongo (Chart 内置 StatefulSet) 而非 Operator
# 在 provider.yaml 中设置:
# mongo-operator:
#   enabled: false
# managedMongo:
#   enabled: true
```

**验证命令：**
```bash
kubectl get crd | grep -E "postgresql|mongodb"
kubectl get pods -n postgres-operator
```

---

### 4.3 cert-manager 未安装

**现象：** Ingress 的 TLS Secret 一直处于 `Pending`，证书未签发。

**根因：** FDSC Chart 中所有 Ingress 都配置了 `cert-manager.io/cluster-issuer` 注解，依赖 cert-manager 自动签发证书。

**解决方案：**
```bash
helm install cert-manager jetstack/cert-manager \
    --namespace cert-manager --create-namespace \
    --set crds.enabled=true --wait --timeout 5m
```

**验证命令：**
```bash
kubectl get pods -n cert-manager
kubectl get clusterissuer
kubectl get certificates -A
```

---

### 4.4 Keycloak DID 证书算法不匹配

**现象：** Keycloak 启动后，DID 操作失败，日志报错 `signature algorithm not supported` 或 VC 签发失败。

**根因：** cert-manager 默认签发 RSA 证书，但 FDSC 的 DID 操作要求 ECDSA (ES256) 算法。Keycloak 使用 `signingKey.keyAlgorithm: ES256` 配置，需要 ECDSA 私钥。

**解决方案：**
```bash
# 1. 删除旧的 RSA 证书 Secret
kubectl delete secret mp-operations.org-tls -n provider

# 2. 确保 Ingress 注解包含 ECDSA 算法
# provider.yaml 中:
# cert-manager.io/private-key-algorithm: "ECDSA"

# 3. cert-manager 会自动重新签发 ECDSA 证书
# 4. 重启 Keycloak Pod
kubectl delete pod -l app.kubernetes.io/name=keycloak -n provider
```

**验证命令：**
```bash
# 检查证书算法
kubectl get secret mp-operations.org-tls -n provider -o jsonpath='{.data.tls\.crt}' \
    | base64 -d | openssl x509 -text -noout | grep "Signature Algorithm"
# 应输出: ecdsa-with-SHA256
```

---

### 4.5 Verifier init container subPath mount 问题

**现象：** Verifier Pod 的 `add-root-ca` init container 启动失败，报文件挂载错误。

**根因：** Kubernetes 的 subPath mount 在 init container 和主容器之间存在已知的文件系统隔离问题。`/etc/ssl/cert.pem` 使用 `subPath: cert.pem` 挂载时，init container 写入的内容可能不可见。

**解决方案：** 重启 Pod（Kubernetes 会重新执行 init container 并正确挂载）。
```bash
kubectl delete pod -l app.kubernetes.io/name=verifier -n provider
```

**验证命令：**
```bash
kubectl get pods -n provider | grep verifier
kubectl logs -n provider -l app.kubernetes.io/name=verifier -c add-root-ca
```

---

### 4.6 TIL 注册 Job 失败堆积

**现象：** `kubectl get pods -n provider` 显示大量 `til-registration-*` Pod 处于 `Error` 或 `CrashLoopBackOff` 状态。

**根因：** TIL (Trusted Issuers List) 注册 Job 依赖 Verifier 和 TIR 服务就绪。如果这些服务尚未启动，Job 会失败并重试，导致多个失败 Pod 堆积。

**解决方案：**
```bash
# 清理所有失败的 Job Pod
kubectl delete jobs -n provider --field-selector status.successful=0

# 或删除所有失败的 til-registration Pod
kubectl get pods -n provider | grep til-registration | grep -v Running | \
    awk '{print $1}' | xargs kubectl delete pod -n provider
```

**验证命令：**
```bash
kubectl get jobs -n provider
kubectl get pods -n provider | grep til-registration
```

---

### 4.7 Ingress 缺失 ingressClassName

**现象：** 所有 Ingress 返回 404，nginx-ingress-controller 日志显示 `no endpoints available` 或 `ingress not found`。

**根因：** FDSC Chart 的 Ingress 资源默认使用 Traefik 注解（`traefik.ingress.kubernetes.io/router.tls`），但未设置 `spec.ingressClassName`。禁用 Traefik 后，nginx-ingress-controller 需要明确的 `ingressClassName: nginx` 才能识别 Ingress。

**解决方案：**
```bash
# 方法 1: 一次性 patch 所有 Ingress
kubectl get ingress -A -o name | xargs -I {} kubectl patch {} \
    --type merge -p '{"spec":{"ingressClassName":"nginx"}}'

# 方法 2: 在 values.yaml 中为每个组件添加 ingressClassName
# (Chart 较旧版本可能不支持，需要手动 patch)
```

**验证命令：**
```bash
kubectl get ingress -A -o custom-columns='NAMESPACE:.metadata.namespace,NAME:.metadata.name,CLASS:.spec.ingressClassName'
# 所有 Ingress 的 CLASS 列应显示 nginx
```

---

### 4.8 Consumer keystore-password Secret 缺失

**现象：** Consumer Keycloak Pod 启动失败，日志报 `secret "keystore-password" not found`。

**根因：** Consumer Keycloak 的 `prepare-keystore` init container 需要从 `keystore-password` Secret 读取密码来创建 PKCS12 keystore。Chart 不会自动创建这个 Secret。

**解决方案：**
```bash
kubectl create secret generic keystore-password \
    --from-literal=password=changeit \
    -n consumer
```

**验证命令：**
```bash
kubectl get secret keystore-password -n consumer
kubectl get pods -n consumer | grep keycloak
```

---

### 4.9 Contract Management API 404

**现象：** 访问 `contract-management.127.0.0.1.nip.io` 返回 404。

**根因：** Contract Management 服务虽然部署了，但不暴露标准的 negotiation/transfer REST API。它主要通过 TMForum API 的通知机制（`notification.enabled: true`）工作，而不是提供独立的合同协商端点。

**解决方案：** Demo 中用本地 dataclass 模拟 Contract Negotiation 和 Transfer Process 状态流转。
```python
@dataclass
class NegotiationState:
    negotiation_id: str = ""
    state: str = "INITIATED"
    state_history: list = field(default_factory=list)
```

**验证命令：**
```bash
curl -k https://contract-management.127.0.0.1.nip.io/
# 预期: 404 或 401 (服务存在但无公开端点)
```

---

### 4.10 端口占用 (k3s 80/443)

**现象：** nginx-ingress-controller 无法绑定 80/443 端口。

**根因：** k3s Docker 容器已将主机的 80/443 端口映射到容器内部。nginx-ingress-controller 在容器内运行时，端口已被 k3s 的 Service LB 占用。

**解决方案：** 无需额外处理。k3s 的 Service LB 会自动将流量转发到 nginx-ingress-controller 的 ClusterIP。通过 nip.io 域名访问时，请求链路为：
```
主机:80 → k3s 容器:80 → nginx-ingress ClusterIP → Pod
```

**验证命令：**
```bash
# 从主机访问
curl -k https://keycloak-provider.127.0.0.1.nip.io/realms/test-realm
```

---

## 5. 配置参考

### 5.1 provider.yaml 关键配置

```yaml
# cert-manager 算法 (必须 ECDSA)
cert-manager.io/private-key-algorithm: "ECDSA"

# Keycloak DID 签名算法
keycloak:
  signingKey:
    keyAlgorithm: ES256
    did: did:web:mp-operations.org

# MongoDB: 使用 managedMongo (非 Operator)
mongo-operator:
  enabled: false
managedMongo:
  enabled: true

# Verifier DID 配置
decentralizedIam:
  vcAuthentication:
    vcverifier:
      deployment:
        verifier:
          did: did:web:mp-operations.org
          requestKeyAlgorithm: ES256
```

### 5.2 consumer.yaml 关键配置

```yaml
# 仅启用 Consumer 所需组件
decentralizedIam:
  enabled: true
  vcAuthentication:
    vcverifier:
      enabled: false
    credentials-config-service:
      enabled: false
    trusted-issuers-list:
      enabled: false
  odrlAuthorization:
    enabled: false

# DID
did:
  enabled: true
  config:
    server:
      hostUrl: "http://fancy-marketplace.biz"

# 禁用不需要的组件
tm-forum-api:
  enabled: false
contract-management:
  enabled: false
scorpio:
  enabled: false
```

### 5.3 Secret 管理

| Secret | Namespace | 用途 | 创建方式 |
|--------|-----------|------|---------|
| `keystore-password` | provider | Keycloak PKCS12 keystore 密码 | Chart 自动创建 |
| `keystore-password` | consumer | Keycloak PKCS12 keystore 密码 | **手动创建** |
| `mp-operations.org-tls` | provider | Provider DID 证书 (ECDSA) | cert-manager 签发 |
| `fancy-marketplace.biz-tls` | consumer | Consumer DID 证书 (ECDSA) | cert-manager 签发 |
| `verifier.mp-operations.org-tls` | provider | Verifier 签名证书 | cert-manager 签发 |

---

## 6. 快速排查速查表

| 症状 | 可能原因 | 排查命令 | 解决方案 |
|------|---------|---------|---------|
| Pod `ImagePullBackOff` | 镜像拉取超时 | `kubectl describe pod <name>` | 等待/换镜像源 |
| Pod `Pending` (PVC) | StorageClass 或 Operator 缺失 | `kubectl describe pvc -A` | 安装 PostgreSQL Operator |
| Pod `CrashLoop` (Keycloak) | Secret 缺失 | `kubectl logs <pod>` | 创建 `keystore-password` |
| Ingress 404 | ingressClassName 缺失 | `kubectl get ingress -A` | patch ingressClassName |
| TLS 证书 Pending | cert-manager 未安装 | `kubectl get certificates -A` | 安装 cert-manager |
| DID 签名失败 | 证书算法 RSA (需 ECDSA) | `openssl x509 -text` | 删除旧 Secret，重新签发 |
| Verifier 启动失败 | subPath mount 问题 | `kubectl logs <pod> -c add-root-ca` | 重启 Pod |
| TIL Job 堆积 | 依赖服务未就绪 | `kubectl get jobs -A` | 清理失败 Job |
| Scorpio 查询 400 | 空查询返回 400 (正常) | `curl <scorpio>/ngsi-ld/v1/entities` | 非错误，服务正常 |
| TMForum 无数据 | 未创建 ProductOffering | `curl <tmf>/productOffering` | Demo 中自动创建 |
| Contract API 404 | 服务不暴露 REST API | `curl -k <contract-mgmt>/` | 本地 dataclass 模拟 |
| Token endpoint 格式差异 | Consumer 用 legacy 格式 | `curl <kc>/realms/<realm>` | 检查 `token-service` 字段 |

---

## 7. 与 FIWARE DSC 的对应关系

| 部署组件 | FIWARE DSC 角色 | 说明 |
|---------|----------------|------|
| Keycloak + DID Helper | 凭证签发 | Consumer 和 Provider 各自部署 |
| VCVerifier + CCS + TIL | 认证框架 | 仅 Provider 部署 |
| APISIX + OPA + ODRL-PAP | 授权框架 | 仅 Provider 部署 |
| TMForum API | 产品目录 | 数据 Offering 管理 |
| Scorpio | 数据服务 | NGSI-LD Context Broker |
| Contract Management | 合同管理 | 当前未完全配置 |
| TIR (Trust Anchor) | 信任锚点 | 独立命名空间，中立运营 |

---

## 8. 相关文档

- [架构与通信流程](./ARCHITECTURE.md)
- [README](./README.md)
- [数据交换 Demo](./data_exchange_demo.md)
- [项目概述](../wiki/1-xiang-mu-gai-shu.md)
- [快速部署指南](../wiki/2-kuai-su-bu-shu-zhi-nan.md)
