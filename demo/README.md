# FIWARE DSC 数据空间演示

两种演示模式：**Mock Demo** (纯本地模拟) 和 **Real Cluster Demo** (走真实 k3s 集群)。

## 快速开始

### 前置条件

- Python 3.10+
- [uv](https://docs.astral.sh/uv/) 包管理器
- (可选) Docker + k3s 集群 (仅 Real Cluster Demo)

### Mock Demo (纯本地，不需要集群)

```bash
cd demo
uv run python run_demo.py
```

自动启动 Provider Mock API → Consumer 发现 → 认证 → 协商 → 传输 → 获取数据 → 验证。

### Real Cluster Demo (走真实 k3s 集群)

```bash
# 先确保 k3s 集群已启动并部署完成
just up                      # 一键启动集群 + 部署所有服务
just demo-cluster            # 运行完整数据交换流程
```

通过 nginx-ingress 访问集群中的 Keycloak、TMForum API、Scorpio 等真实服务。

## 项目结构

```
demo/
├── config.py              # 集中配置 (JWT, 端口, 路径, 凭证)
├── provider_server.py     # FastAPI Mock Provider (675 行)
├── consumer_client.py     # Consumer 客户端 (496 行)
├── run_demo.py            # Mock Demo 编排器 (221 行)
├── demo_real_cluster.py   # Real Cluster Demo (330 行)
├── pyproject.toml         # 依赖管理
├── uv.lock                # 锁定依赖版本
├── ARCHITECTURE.md        # 架构与通信流程文档
└── logs/                  # 运行日志
```

## 两种 Demo 对比

| 维度 | Mock Demo | Real Cluster Demo |
|------|-----------|-------------------|
| 需要 k3s | ❌ | ✅ |
| 认证方式 | 模拟 JWT | 真实 Keycloak OIDC |
| 数据服务 | 本地 JSON 文件 | Scorpio NGSI-LD + TMForum API |
| Offering 创建 | FastAPI 内存 | TMForum ProductCatalog API |
| 数据访问 | 静态 JSON 文件 | Scorpio 实体查询 |
| Contract Negotiation | Provider 内存状态机 | 本地 dataclass 模拟 |
| Transfer Process | Provider 内存状态机 | 本地 dataclass 模拟 |
| 用途 | 开发演示、流程理解 | 部署验证、集成测试 |
| 启动命令 | `just demo-python` | `just demo-cluster` |

## 演示流程

### Mock Demo 流程 (7 步)

```
Provider 发布 Offering (加载 JSON-LD metadata + OpenAPI contract)
    ↓
1. Consumer 发现 Catalog        → GET /api/catalog
2. 查看 Offering 详情           → GET /api/catalog/{id}
3. 认证 (模拟 OID4VP)          → POST /auth/token
4. 合同协商                     → POST /api/contract-negotiations
5. 数据传输                     → POST /api/transfer-processes
6. 获取数据                     → GET /api/energy/buildings/hourly
7. 验证数据格式                 → 内部校验
```

### Real Cluster Demo 流程 (7 步)

```
1. 集群健康检查                 → 7 个 ingress 端点 (Keycloak, TMForum, Scorpio, TIR, TIL, Dashboard)
2. Provider 创建 Data Offering  → Scorpio 创建 NGSI-LD 实体 + TMForum 创建 ProductSpec + ProductOffering
3. Consumer 发现 Catalog       → TMForum GET /productOffering
4. Consumer Keycloak 认证       → OIDC password grant → 获取 access_token
5. Contract Negotiation         → 本地模拟 REQUESTED → CONFIRMED → AGREED 状态流转
6. Transfer Process             → 本地模拟 REQUESTED → STARTED → COMPLETED 状态流转
7. Consumer 获取数据            → Scorpio GET /ngsi-ld/v1/entities/{id}
```

> 详细时序图和代码位置见 [ARCHITECTURE.md](./ARCHITECTURE.md)

## 配置管理

所有配置集中在 `config.py`，支持环境变量覆盖：

| 环境变量 | 默认值 | 说明 |
|---------|--------|------|
| `DEMO_JWT_SECRET` | `dssc-demo-secret-key-...` | JWT 签名密钥 |
| `DEMO_MOCK_PORT` | `8000` | Mock 服务端口 |
| `DEMO_KC_REALM` | `test-realm` | Keycloak realm |
| `DEMO_KC_USERNAME` | `employee` | Keycloak 用户名 |
| `DEMO_KC_PASSWORD` | `test` | Keycloak 密码 |
| `KUBECONFIG` | `/tmp/k3s.yaml` | k3s kubeconfig 路径 |

## Justfile 快捷命令

```bash
# Mock Demo
just demo-python              # 运行完整 Mock Demo
just demo-run                 # 运行并保存日志
just demo-client              # 仅运行 Consumer
just demo-building BLD-001    # 按建筑 ID 过滤

# Real Cluster Demo
just demo-cluster             # 运行完整集群 Demo (ingress 直连)
just demo-cluster-health      # 仅健康检查

# 集群管理
just up                       # 一键启动: k3s → 基础设施 → 应用 → smoke test
just down                     # 一键停止 (关机前，保留镜像缓存)
just smoke-test               # 快速检查所有 Pod
just pods                     # 查看所有 Pod
just logs-keycloak            # 查看 Keycloak 日志
just releases                 # 查看所有 Helm releases
```

## Real Cluster 服务端点

通过 nginx-ingress 访问，所有域名解析到 `127.0.0.1`：

| 服务 | 端点 | 用途 |
|------|------|------|
| Provider Keycloak | `https://keycloak-provider.127.0.0.1.nip.io` | Provider 认证 |
| Consumer Keycloak | `https://keycloak-consumer.127.0.0.1.nip.io` | Consumer 认证 |
| TMForum API | `https://tm-forum-api.127.0.0.1.nip.io` | ProductCatalog (Offering 管理) |
| Scorpio | `https://scorpio-provider.127.0.0.1.nip.io` | NGSI-LD Context Broker (数据存储) |
| TIR | `https://tir.127.0.0.1.nip.io` | Trusted Issuers Registry (DID 注册) |
| TIL | `https://til-provider.127.0.0.1.nip.io` | Trusted Issuers List |
| Dashboard | `https://dashboard-provider.127.0.0.1.nip.io` | FDSC 管理界面 |
| Verifier | `https://verifier.mp-operations.org` | VCVerifier (凭证验证) |
| APISIX | `https://mp-data-service.127.0.0.1.nip.io` | API Gateway |

## API 端点 (Mock Provider)

| 端点 | 方法 | 描述 | 认证 |
|------|------|------|------|
| `/` | GET | API 根目录 | ❌ |
| `/health` | GET | 健康检查 | ❌ |
| `/api/catalog` | GET | 数据目录 | ❌ |
| `/api/catalog/{id}` | GET | Offering 详情 (含 metadata + contract) | ❌ |
| `/api/catalog/offerings` | POST | 发布 Offering | ✅ |
| `/api/contract-negotiations` | POST | 发起协商 | ✅ |
| `/api/transfer-processes` | POST | 发起传输 | ✅ |
| `/api/energy/buildings/hourly` | GET | 建筑能耗数据 | ✅ |
| `/api/metadata` | GET | 元数据 (JSON-LD) | ❌ |
| `/auth/token` | POST | 获取 JWT Token | ❌ |

## 数据格式

### 能耗数据

```json
{
  "datasetId": "building-energy-hourly-v1",
  "providerName": "Energy Data Provider Ltd.",
  "license": "CC-BY-4.0",
  "records": [
    {
      "buildingId": "BLD-001",
      "meterId": "MTR-001",
      "timestamp": "2026-05-01T00:00:00+08:00",
      "energyKWh": 12.4,
      "unit": "kWh",
      "location": {"city": "Shenzhen", "district": "Nanshan"}
    }
  ]
}
```

### 元数据 (JSON-LD)

```json
{
  "@context": {"dcat": "http://www.w3.org/ns/dcat#", "dct": "http://purl.org/dc/terms/"},
  "@type": "dcat:Dataset",
  "dct:title": "Building Energy Consumption Dataset API",
  "ex:datasetId": "building-energy-hourly-v1",
  "ex:unit": "kWh"
}
```

## 与 FIWARE DSC 的对应关系

| 演示组件 | FIWARE DSC 组件 | 说明 |
|---------|----------------|------|
| `/auth/token` | VCVerifier + Keycloak | 身份认证和令牌签发 |
| TMForum API | Product Catalog Manager | 数据目录、Offering 管理 |
| Scorpio | Context Broker | NGSI-LD 数据存储与查询 |
| Contract Negotiation | EDC Connector | 合同协商状态机 |
| Transfer Process | EDC Connector | 数据传输状态机 |
| TIR/TIL | Trusted Issuers Registry | DID 注册与验证 |

## 停止与重启集群

### 停止集群（关机前）

```bash
just down                    # 一键停止: clean + k3s-stop
```

或者手动分步执行：

```bash
just clean                   # 卸载 Helm releases + 删除命名空间
docker stop k3s-server && docker rm k3s-server   # 停止 k3s 容器
```

`just clean` 只删除 Helm releases 和命名空间，**不会删除 Docker 卷 `k3s-data`**。k3s 内部的容器镜像缓存保留在该卷中，下次启动时不需要重新拉取。

### 重启集群

```bash
just k3s-start               # 启动 k3s 容器（使用已有的 k3s-data 卷）
export KUBECONFIG=/tmp/k3s.yaml
just deploy-all              # 部署 trust-anchor + provider + consumer
```

整个重启过程约 3-5 分钟，无需重新下载镜像。

### 完全清理（释放磁盘空间）

```bash
just clean
docker stop k3s-server && docker rm k3s-server
docker volume rm k3s-data    # 删除卷后需要重新拉取镜像
```

## 故障排除

### 端口被占用

```bash
lsof -i :8000
kill -9 <PID>
```

### 依赖问题

```bash
cd demo && uv sync --reinstall
```

### k3s 集群问题

```bash
just k3s-status              # 检查 k3s 容器
just pods                    # 查看所有 Pod
just events                  # 查看事件
just logs-keycloak           # 查看 Keycloak 日志
just releases                # 查看 Helm releases
```

### Ingress 不通

```bash
# 检查 nginx-ingress controller
kubectl get pods -n ingress-nginx

# 检查 ingress class
kubectl get ingressclass

# 检查 ingress 资源
kubectl get ingress -A
```

## 相关文档

- [架构与通信流程](./ARCHITECTURE.md)
- [部署笔记 (踩坑记录 + 技术选型)](./A_fiware_deployment_notes.md)
- [数据交换 Demo (流程 + 踩坑 + 扩展指南)](./data_exchange_demo.md)
- [项目概述](../wiki/1-xiang-mu-gai-shu.md)
- [快速部署指南](../wiki/2-kuai-su-bu-shu-zhi-nan.md)
- [场景说明](../DSSC_Tool_Learning/DSSC_Minimal_Energy_Scenario/README.md)
- [验证指南](../DSSC_Tool_Learning/DSSC_Minimal_Energy_Scenario/VALIDATION_GUIDE.md)
- [集群排查记录](../doc/troubleshooting-k3s-deployment.md)
