# FIWARE Data Space Connector：Building Energy Data Exchange Demo

> **运行环境**：Windows 11 + WSL2 Ubuntu + Docker Desktop
> **项目目录**：`~/DSSC_projects/data-space-connector`
> **FIWARE DSC 版本**：`10.4.0`
> **Provider**：`Energy Data Provider Ltd.`
> **Consumer**：`City Analytics Lab`

---

## 一、Demo 目标与业务场景

### 1. 业务场景

本 Demo 围绕 **Building Energy Consumption Data Product（建筑能耗数据产品）** 展开。

* **Provider**：`Energy Data Provider Ltd.`，负责保存并发布建筑能耗数据；
* **Consumer**：`City Analytics Lab`，负责发现数据产品、创建订单并访问数据；
* **数据类型**：`BuildingEnergyReading`；
* **数据服务**：FIWARE Scorpio NGSI-LD API；
* **产品管理**：TM Forum Product Catalog 与 Product Ordering API；
* **合同处理**：Contract Management；
* **身份认证**：Verifiable Credential 与 VC Verifier；
* **访问控制**：APISIX、OPA 与 ODRL Policy。

本 Demo 验证以下完整流程：

```text
Provider 发布建筑能耗数据
        │
        ▼
发布 ProductOffering
        │
        ▼
Consumer 发现产品
        │
        ▼
注册 Consumer Organization
        │
        ▼
创建 ProductOrder
        │
        ▼
订单更新为 completed
        │
        ▼
Contract Management 处理事件
        │
        ▼
Consumer 获取 Access Token
        │
        ▼
访问受保护数据服务
        │
        ▼
获取 BuildingEnergyReading
```

---

### 2. Demo 已创建的业务对象

本项目已经创建以下 FIWARE 业务对象。

#### ProductOffering

```text
urn:ngsi-ld:product-offering:b2f608e2-262d-41ad-bebc-e367f1913bbb
```

#### Consumer Organization

```text
urn:ngsi-ld:organization:8b79c3b2-afa3-4eaf-84c8-19bdbc497f57
```

#### ProductOrder

```text
urn:ngsi-ld:product-order:33361d40-af51-452a-a507-bd7651e8bf16
```

#### ProductOrder Item

```text
building-energy-order-item-20260704130107
```

---

## 二、Demo 运行前准备

### 1. 启动 Docker Desktop

运行 Demo 前，首先在 Windows 中启动 Docker Desktop。

打开 Docker Desktop 后，应确认页面显示：

```text
Docker Engine running
```

如果 Docker Engine 没有启动，WSL 中的 Docker 和 k3s 集群将无法访问。

### 🖼️ Docker Desktop 运行截图

> 截图应显示 Docker Desktop 已启动，以及 Docker Engine 为绿色运行状态。

```text
![[docker-desktop-running.png|700]]
```

---

### 2. 进入 WSL Ubuntu

打开 WSL Ubuntu 终端，先检查 Docker 是否可以正常使用：

```bash
docker info
```

如果命令能够正常显示 Docker Server、Container 和 Storage Driver 等信息，说明 WSL 已成功连接 Docker Desktop。

也可以执行：

```bash
docker ps
```

### 🖼️ Docker 环境验证截图

```text
![[docker-info.png|700]]
```

---

### 3. 使用脚本恢复 FIWARE 环境

本项目已经完成 FIWARE DSC 的首次部署，因此计算机或 WSL 重启后，不需要重新执行完整 Maven 部署。

在 WSL 中运行：

```bash
~/start-fiware.sh
```

该脚本主要负责：

* 检查 Docker 是否可用；
* 检查 k3s 容器是否存在；
* 启动或复用已有 k3s 容器；
* 等待 Kubernetes API Server；
* 检查 Kubernetes Node；
* 检查 FIWARE 主要组件状态。

执行过程中可能显示：

```text
k3s 容器已经在运行。
等待 Kubernetes API...
```

当输出中出现：

```text
STATUS: Ready
```

说明本地 Kubernetes 集群已经恢复。

### 🖼️ FIWARE 启动脚本截图

```text
![[03-start-fiware.png|700]]
```

> 该截图属于环境稳定后的复现验证截图，不代表首次部署时的原始截图。

---

### 4. 设置 Kubernetes 配置

进入 FIWARE DSC 项目目录：

```bash
cd "$HOME/DSSC_projects/data-space-connector"
```

设置 kubeconfig：

```bash
export KUBECONFIG="$(pwd)/target/k3s.yaml"
```

检查当前配置：

```bash
echo "$KUBECONFIG"
kubectl config current-context
```

---

### 5. 检查 Kubernetes Node

执行：

```bash
kubectl get nodes -o wide
```

预期结果：

```text
NAME   STATUS   ROLES                  VERSION
k3s    Ready    control-plane,master   ...
```

当 Node 状态为 `Ready` 时，说明 Kubernetes Control Plane 已正常运行。

### 🖼️ Kubernetes Node 状态截图

```text
![[04-kubernetes-node-ready.png|700]]
```

---

### 6. 检查 FIWARE 关键组件

执行：

```bash
kubectl get pods -A
```

由于输出内容较多，可以只显示关键组件：

```bash
kubectl get pods -A |
grep -E \
'contract-management|data-service-scorpio|provider-apisix|odrl-pap|trusted-issuers-list|verifier|keycloak|tir'
```

重点检查以下组件：

```text
provider/contract-management
provider/data-service-scorpio
provider/provider-apisix
provider/odrl-pap
provider/trusted-issuers-list
provider/verifier
provider/provider-keycloak
consumer/consumer-keycloak
trust-anchor/tir
```

正常运行的服务应显示：

```text
Running
```

已完成的初始化任务可能显示：

```text
Completed
```

这不属于错误。

### 🖼️ FIWARE 关键组件运行截图

```text
![[05-fiware-components-running.png|700]]
```

---

## 三、Demo 终端窗口安排

本 Demo 建议同时打开两个 WSL 终端窗口。

### 窗口 A：观察后台状态

窗口 A 用于观察 Contract Management 的实时日志。

执行：

```bash
cd "$HOME/DSSC_projects/data-space-connector"

export KUBECONFIG="$(pwd)/target/k3s.yaml"

kubectl logs -f deployment/contract-management \
  -n provider
```

窗口 A 在 Demo 过程中保持运行。

它用于观察：

* ProductOrder 事件；
* 订单状态变化；
* Contract Management Handler；
* Trusted Issuers List Handler；
* Policy 与 Credential 配置解析。

---

### 窗口 B：执行 Consumer 请求

窗口 B 用于执行：

* 数据查询；
* ProductOffering 查询；
* Consumer Organization 查询；
* ProductOrder 查询；
* Access Token 获取；
* 匿名请求；
* 授权数据请求。

整个演示过程中：

```text
窗口 A：观察 Connector 和 Contract Management 后台日志
窗口 B：执行 API 请求并查看返回结果
```

## 四、重新创建完整 Demo 数据链路

为了获得一套时间顺序完整、对象关系清晰的实验记录，本次 Demo 不直接复用此前创建的 Building Energy 数据、Consumer Organization、ProductOffering 和 ProductOrder，而是在保持 FIWARE 基础设施不变的情况下，重新创建一套新的业务对象。

需要重新创建的对象包括：

```text
BuildingEnergyReading
        ↓
ProductSpecification
        ↓
ProductOffering
        ↓
Consumer Organization
        ↓
ProductOrder
        ↓
ProductOrder completed
        ↓
Contract Management Event
        ↓
Protected Data Access
```

FIWARE 的 Provider、Consumer、Trust Anchor、Keycloak、Scorpio、APISIX、OPA 和 Contract Management 等基础组件不需要重新部署。

---

### 1. 启动 FIWARE 环境

首先运行：

```bash
~/start-fiware.sh
```

进入项目目录：

```bash
cd "$HOME/DSSC_projects/data-space-connector"
```

设置 Kubernetes 配置：

```bash
export KUBECONFIG="$(pwd)/target/k3s.yaml"
```

检查环境：

```bash
kubectl get nodes
kubectl get pods -A
```

当 Kubernetes Node 为 `Ready`，且 FIWARE 关键组件处于 `Running` 或 `Completed` 状态时，可以开始本轮 Demo。

#### 🖼️ FIWARE 环境启动截图

```text
![[01-start-fiware.png|700]]
```

---

### 2. 创建本轮 Demo 标识

为了避免与此前创建的对象发生 ID 冲突，使用当前时间生成唯一标识：

```bash
export RUN_ID=$(date +%Y%m%d%H%M%S)
echo "Current Demo Run ID: $RUN_ID"
```

示例输出：

```text
Current Demo Run ID: 20260718143520
```

随后定义本轮数据实体 ID：

```bash
export ENERGY_ENTITY_ID="urn:ngsi-ld:BuildingEnergyReading:demo-${RUN_ID}"
```

定义订单 Item ID：

```bash
export ORDER_ITEM_ID="building-energy-order-item-${RUN_ID}"
```

建议整个 Demo 在同一个终端会话中执行，避免关闭终端后环境变量丢失。

#### 🖼️ Demo Run ID 截图

```text
![[02-demo-run-id.png|600]]
```

---

# Step 1 Provider 创建建筑能耗数据

本步骤不直接查询已有数据，而是在 Provider 的 Scorpio Context Broker 中创建一条新的 `BuildingEnergyReading`。

执行：

```bash
curl -k -x localhost:8888 -sS \
  -D /tmp/create-energy-headers.txt \
  -o /tmp/create-energy-response.txt \
  -w "\nCreate BuildingEnergyReading HTTP status: %{http_code}\n" \
  -X POST \
  "https://scorpio-provider.127.0.0.1.nip.io/ngsi-ld/v1/entities" \
  -H "Content-Type: application/json" \
  -d "{
    \"id\": \"${ENERGY_ENTITY_ID}\",
    \"type\": \"BuildingEnergyReading\",
    \"buildingId\": {
      \"type\": \"Property\",
      \"value\": \"building-demo-${RUN_ID}\"
    },
    \"meterId\": {
      \"type\": \"Property\",
      \"value\": \"meter-demo-${RUN_ID}\"
    },
    \"timestamp\": {
      \"type\": \"Property\",
      \"value\": \"$(date -u +%Y-%m-%dT%H:%M:%SZ)\"
    },
    \"energyKWh\": {
      \"type\": \"Property\",
      \"value\": 128.4
    },
    \"unit\": {
      \"type\": \"Property\",
      \"value\": \"kWh\"
    },
    \"location\": {
      \"type\": \"Property\",
      \"value\": \"Shenzhen Demonstration District\"
    }
  }"
```

预期状态码通常为：

```text
Create BuildingEnergyReading HTTP status: 201
```

如果环境需要本地代理，则在 `curl` 中加入：

```bash
-x localhost:8888
```

#### 🖼️ 创建 BuildingEnergyReading 截图

```text
![[03-create-building-energy.png|700]]
```

该结果说明 Provider 已在本轮 Demo 中创建一条全新的建筑能耗数据。

---

# Step 2 查询刚刚创建的数据

不要使用：

```bash
?type=BuildingEnergyReading&limit=1
```

因为它可能返回以前创建的第一条记录，无法证明本轮数据创建成功。

应直接使用本轮实体 ID 查询：

```bash
curl -k -x localhost:8888 -sS \
  "https://scorpio-provider.127.0.0.1.nip.io/ngsi-ld/v1/entities/${ENERGY_ENTITY_ID}" |
jq .
```

返回结果中应包含：

```text
id: urn:ngsi-ld:BuildingEnergyReading:demo-${RUN_ID}
type: BuildingEnergyReading
buildingId
meterId
timestamp
energyKWh
unit
location
```

#### 🖼️ 查询新建数据截图

```text
![[04-query-new-building-energy.png|700]]
```

该结果证明截图中的数据不是历史遗留记录，而是本轮 Demo 新创建的实体。

---

# Step 3 获取产品管理所需 Access Token

Consumer 在调用受保护的 TM Forum API 前，需要使用 Credential 获取 Access Token。

使用已经配置好的 Representative Credential：

```bash
export ACCESS_TOKEN=$(
  ./doc/scripts/get_access_token_oid4vp.sh \
    https://mp-data-service.127.0.0.1.nip.io \
    "$REP_CREDENTIAL" \
    default
)
```

不要在终端中打印完整 Token。

只检查是否成功：

```bash
if [ -n "$ACCESS_TOKEN" ]; then
  echo "Access Token obtained successfully"
else
  echo "Failed to obtain Access Token"
fi
```

预期输出：

```text
Access Token obtained successfully
```

#### 🖼️ Access Token 获取结果截图

```text
![[05-access-token-obtained.png|600]]
```

# Step 4 创建新的 ProductSpecification
## 4.1 设置 Provider DID

首先设置本地 FIWARE Provider 使用的 DID：

```bash
export PROVIDER_DID="did:web:mp-operations.org"
```

检查变量：

```bash
echo "PROVIDER_DID=${PROVIDER_DID}"
```

预期输出：

```text
PROVIDER_DID=did:web:mp-operations.org
```

---

## 4.2 创建 Building Energy ProductSpecification

执行以下命令：

```bash
export PRODUCT_SPEC_ID=$(
  curl -k -x localhost:8888 -sS \
    -X POST \
    "https://tm-forum-api.127.0.0.1.nip.io/tmf-api/productCatalogManagement/v4/productSpecification" \
    -H "Content-Type: application/json;charset=utf-8" \
    -d "{
      \"brand\": \"Energy Data Provider Ltd.\",
      \"version\": \"1.0.0\",
      \"lifecycleStatus\": \"ACTIVE\",
      \"name\": \"Building Energy Consumption Dataset API - ${RUN_ID}\",
      \"description\": \"Hourly building energy consumption data provided through the FIWARE NGSI-LD data service.\",
      \"productSpecCharacteristic\": [
        {
          \"id\": \"credentialsConfig\",
          \"name\": \"Credentials Config\",
          \"@schemaLocation\": \"https://raw.githubusercontent.com/FIWARE/contract-management/refs/heads/main/schemas/credentials/credentialConfigCharacteristic.json\",
          \"valueType\": \"credentialsConfiguration\",
          \"productSpecCharacteristicValue\": [
            {
              \"isDefault\": true,
              \"value\": {
                \"credentialsType\": \"OperatorCredential\",
                \"claims\": [
                  {
                    \"name\": \"roles\",
                    \"path\": \"$.roles[?(@.target==\\\"${PROVIDER_DID}\\\")].names[*]\",
                    \"allowedValues\": [
                      \"OPERATOR\"
                    ]
                  }
                ]
              }
            }
          ]
        },
        {
          \"id\": \"policyConfig\",
          \"name\": \"Policy for reading Building Energy data\",
          \"@schemaLocation\": \"https://raw.githubusercontent.com/FIWARE/contract-management/refs/heads/policy-support/schemas/odrl/policyCharacteristic.json\",
          \"valueType\": \"authorizationPolicy\",
          \"productSpecCharacteristicValue\": [
            {
              \"isDefault\": true,
              \"value\": {
                \"@context\": {
                  \"odrl\": \"http://www.w3.org/ns/odrl/2/\"
                },
                \"@id\": \"https://energy-data-provider.example/policy/building-energy-${RUN_ID}\",
                \"odrl:uid\": \"https://energy-data-provider.example/policy/building-energy-${RUN_ID}\",
                \"@type\": \"odrl:Policy\",
                \"odrl:permission\": {
                  \"odrl:assigner\": \"${PROVIDER_DID}\",
                  \"odrl:target\": {
                    \"@type\": \"odrl:AssetCollection\",
                    \"odrl:source\": \"urn:asset\",
                    \"odrl:refinement\": [
                      {
                        \"@type\": \"odrl:Constraint\",
                        \"odrl:leftOperand\": \"ngsi-ld:entityType\",
                        \"odrl:operator\": \"odrl:eq\",
                        \"odrl:rightOperand\": \"BuildingEnergyReading\"
                      }
                    ]
                  },
                  \"odrl:assignee\": {
                    \"@type\": \"odrl:PartyCollection\",
                    \"odrl:source\": \"urn:user\",
                    \"odrl:refinement\": {
                      \"@type\": \"odrl:LogicalConstraint\",
                      \"odrl:and\": [
                        {
                          \"@type\": \"odrl:Constraint\",
                          \"odrl:leftOperand\": \"vc:role\",
                          \"odrl:operator\": \"odrl:hasPart\",
                          \"odrl:rightOperand\": {
                            \"@value\": \"OPERATOR\",
                            \"@type\": \"xsd:string\"
                          }
                        },
                        {
                          \"@type\": \"odrl:Constraint\",
                          \"odrl:leftOperand\": \"vc:type\",
                          \"odrl:operator\": \"odrl:hasPart\",
                          \"odrl:rightOperand\": {
                            \"@value\": \"OperatorCredential\",
                            \"@type\": \"xsd:string\"
                          }
                        }
                      ]
                    }
                  },
                  \"odrl:action\": \"odrl:read\"
                }
              }
            }
          ]
        }
      ]
    }" |
  jq -r '.id'
)

echo "PRODUCT_SPEC_ID=${PRODUCT_SPEC_ID}"
```

创建成功后，终端应输出类似：

```text
PRODUCT_SPEC_ID=urn:ngsi-ld:product-specification:xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
```

这里不需要手动复制 ID。以下部分已经自动完成：

```bash
export PRODUCT_SPEC_ID=$(...)
```

它会把 TM Forum API 返回 JSON 中的：

```json
{
  "id": "urn:ngsi-ld:product-specification:..."
}
```

提取出来并保存到：

```text
PRODUCT_SPEC_ID
```

---

## 4.3 检查创建结果

首先确认变量不是空值：

```bash
if [ -n "$PRODUCT_SPEC_ID" ] && [ "$PRODUCT_SPEC_ID" != "null" ]; then
  echo "ProductSpecification created successfully"
  echo "PRODUCT_SPEC_ID=${PRODUCT_SPEC_ID}"
else
  echo "ProductSpecification creation failed"
fi
```

正常应显示：

```text
ProductSpecification created successfully
PRODUCT_SPEC_ID=urn:ngsi-ld:product-specification:...
```

---

## 4.4 查询刚创建的 ProductSpecification

使用刚刚返回的 ID查询：

```bash
curl -k -x localhost:8888 -sS \
  "https://tm-forum-api.127.0.0.1.nip.io/tmf-api/productCatalogManagement/v4/productSpecification/${PRODUCT_SPEC_ID}" |
jq '{
  id,
  name,
  brand,
  version,
  lifecycleStatus,
  description,
  productSpecCharacteristic
}'
```

查询结果应包含：

```text
name:
Building Energy Consumption Dataset API - 当前 RUN_ID

brand:
Energy Data Provider Ltd.

lifecycleStatus:
ACTIVE

credentialsConfig:
OperatorCredential + OPERATOR

policyConfig:
允许读取 BuildingEnergyReading
```

### 🖼️ ProductSpecification 创建与查询截图

```text
![[06-create-product-specification.png|700]]
```

截图建议保留：

```text
PRODUCT_SPEC_ID=urn:ngsi-ld:product-specification:...
```

以及查询结果中的：

```text
id
name
brand
lifecycleStatus
credentialsConfig
policyConfig
BuildingEnergyReading
```

该结果说明：

1. Provider 成功创建了新的 ProductSpecification；
2. ProductSpecification 描述了本轮 Building Energy 数据产品；
3. Consumer 需要持有 `OperatorCredential`；
4. Credential 中需要包含面向 Provider 的 `OPERATOR` 角色；
5. 对应 Policy 的目标数据类型为 `BuildingEnergyReading`；
6. 允许的操作为 `odrl:read`。

---

## 4.5 ProductSpecification 的作用

本步骤不仅创建产品名称，还把后续合同处理所需的两个重要配置放进 ProductSpecification。

### Credentials Config

```text
credentialsType = OperatorCredential
allowed role = OPERATOR
target = Provider DID
```

它用于说明 Consumer 后续访问服务时需要提供什么 Credential。

### Policy Config

```text
entity type = BuildingEnergyReading
action = read
credential type = OperatorCredential
role = OPERATOR
```

它用于描述 Consumer 获得订单后应具有的数据读取权限。

当后续 ProductOffering 引用该 ProductSpecification，且 ProductOrder 更新为 `completed` 时，Contract Management 会从 ProductOffering 所引用的 ProductSpecification 中解析 Credential 和 Policy 配置。

因此，下一步创建 ProductOffering 时，应直接引用：

```bash
${PRODUCT_SPEC_ID}
```

---

# Step 5 创建新的 ProductOffering

基于刚刚创建的 ProductSpecification 创建新的 ProductOffering。

```bash
echo "RUN_ID=${RUN_ID}"
echo "PRODUCT_SPEC_ID=${PRODUCT_SPEC_ID}"
export PRODUCT_OFFERING_ID=$(
  curl -k -x localhost:8888 -sS \
    -X POST \
    "https://tm-forum-api.127.0.0.1.nip.io/tmf-api/productCatalogManagement/v4/productOffering" \
    -H "Accept: application/json" \
    -H "Content-Type: application/json;charset=utf-8" \
    -d "{
      \"version\": \"1.0.0\",
      \"lifecycleStatus\": \"ACTIVE\",
      \"name\": \"Building Energy Consumption Offering - ${RUN_ID}\",
      \"description\": \"Access to BuildingEnergyReading data for demo ${RUN_ID}\",
      \"productSpecification\": {
        \"id\": \"${PRODUCT_SPEC_ID}\"
      }
    }" |
  jq -r '.id'
)

echo "ProductOffering ID: ${PRODUCT_OFFERING_ID}"
```
如果 ID 仍然为空

不要反复执行上面的命令，先查看接口的完整返回。执行：

OFFERING_RESPONSE=$(
  curl -k -x localhost:8888 -sS \
    -X POST \
    "https://tm-forum-api.127.0.0.1.nip.io/tmf-api/productCatalogManagement/v4/productOffering" \
    -H "Accept: application/json" \
    -H "Content-Type: application/json;charset=utf-8" \
    -d "{
      \"version\": \"1.0.0\",
      \"lifecycleStatus\": \"ACTIVE\",
      \"name\": \"Building Energy Consumption Offering - ${RUN_ID}\",
      \"description\": \"Access to BuildingEnergyReading data for demo ${RUN_ID}\",
      \"productSpecification\": {
        \"id\": \"${PRODUCT_SPEC_ID}\"
      }
    }"
)

echo "$OFFERING_RESPONSE" | jq .

如果返回中有正常的 id，再保存：

export PRODUCT_OFFERING_ID=$(
  echo "$OFFERING_RESPONSE" |
  jq -r '.id // empty'
)

echo "ProductOffering ID: ${PRODUCT_OFFERING_ID}"

检查：
查询刚创建的 ProductOffering

创建成功后执行：

curl -k -x localhost:8888 -sS \
  "https://tm-forum-api.127.0.0.1.nip.io/tmf-api/productCatalogManagement/v4/productOffering/${PRODUCT_OFFERING_ID}" |
jq '{
  id,
  name,
  version,
  lifecycleStatus,
  productSpecification
}'

应看到：

id
name
version
lifecycleStatus
productSpecification.id

其中：

productSpecification.id

必须等于：

echo "$PRODUCT_SPEC_ID"

#### 🖼️ ProductOffering 创建截图

```text
![[07-create-product-offering.png|700]]
```

截图中应包含：

```text
ProductOffering ID
ProductOffering name
ProductSpecification ID
lifecycleStatus
```

# Step 6 Consumer 发现新的 ProductOffering

ProductOffering 创建完成后，Consumer 需要通过 TM Forum Product Catalog API 查询产品目录，并确认能够发现本轮新发布的 Building Energy 数据产品。

本步骤验证以下流程：

```text
Provider 创建 ProductOffering
        ↓
ProductOffering 写入产品目录
        ↓
Consumer 携带有效 Access Token 查询目录
        ↓
根据 PRODUCT_OFFERING_ID 定位目标产品
```

---

## 6.1 检查本轮 ProductOffering ID

首先确认前一步创建的 ProductOffering ID 已经保存在环境变量中：

```bash
echo "PRODUCT_SPEC_ID=${PRODUCT_SPEC_ID}"
echo "PRODUCT_OFFERING_ID=${PRODUCT_OFFERING_ID}"
```

正常情况下应显示类似：

```text
PRODUCT_SPEC_ID=urn:ngsi-ld:product-specification:b3b4c89a-1803-40e7-8f46-8bd70626a509

PRODUCT_OFFERING_ID=urn:ngsi-ld:product-offering:400c9e16-0f8a-4b6f-842c-e456b1922aab
```

如果 `PRODUCT_OFFERING_ID` 为空，说明前一步 ProductOffering 没有成功创建，此时不能继续执行目录查询。

---

## 6.2 检查 Access Token

查询 TM Forum Product Catalog API 需要携带有效 Access Token。

首先检查当前 Token：

```bash
echo "ACCESS_TOKEN length: ${#ACCESS_TOKEN}"
```

有效 Token 的长度通常明显大于 4。

还应检查 Token 是否为 `null`：

```bash
if [ -n "$ACCESS_TOKEN" ] && [ "$ACCESS_TOKEN" != "null" ]; then
  echo "ACCESS_TOKEN is valid"
else
  echo "ACCESS_TOKEN is missing or invalid"
fi
```

正常应输出：

```text
ACCESS_TOKEN is valid
```

如果显示：

```text
ACCESS_TOKEN is missing or invalid
```

则重新获取 Representative Credential：

```bash
export REP_CREDENTIAL=$(
  ./doc/scripts/get_credential.sh \
    https://keycloak-consumer.127.0.0.1.nip.io \
    user-credential \
    representative
)
```

检查 Credential 是否获取成功：

```bash
if [ -n "$REP_CREDENTIAL" ] && [ "$REP_CREDENTIAL" != "null" ]; then
  echo "REP_CREDENTIAL obtained successfully"
else
  echo "REP_CREDENTIAL creation failed"
fi
```

随后重新获取 Access Token：

```bash
export ACCESS_TOKEN=$(
  ./doc/scripts/get_access_token_oid4vp.sh \
    https://mp-data-service.127.0.0.1.nip.io \
    "$REP_CREDENTIAL" \
    default
)
```

再次检查：

```bash
echo "ACCESS_TOKEN length: ${#ACCESS_TOKEN}"

if [ -n "$ACCESS_TOKEN" ] && [ "$ACCESS_TOKEN" != "null" ]; then
  echo "ACCESS_TOKEN obtained successfully"
else
  echo "ACCESS_TOKEN creation failed"
fi
```

只有看到：

```text
ACCESS_TOKEN obtained successfully
```

后，才能继续查询 ProductOffering。

> 不要在终端中直接输出完整 Access Token、Credential 或私钥。

---

## 6.3 查询 ProductOffering 目录

Consumer 调用 TM Forum Product Catalog API 查询全部 ProductOffering：

```bash
curl -k -x localhost:8888 -sS \
  -o /tmp/product-offerings.json \
  -w "ProductOffering catalogue HTTP status: %{http_code}\n" \
  "https://mp-tmf-api.127.0.0.1.nip.io/tmf-api/productCatalogManagement/v4/productOffering" \
  -H "Authorization: Bearer ${ACCESS_TOKEN}"
```

预期返回：

```text
ProductOffering catalogue HTTP status: 200
```

如果返回：

```text
ProductOffering catalogue HTTP status: 401
```

说明 Access Token 无效、已过期或值为 `null`，需要重新完成上一节的 Token 获取步骤。

---

## 6.4 从目录中筛选本轮 ProductOffering

目录查询成功后，使用本轮的 `PRODUCT_OFFERING_ID` 筛选目标产品：

```bash
jq --arg id "$PRODUCT_OFFERING_ID" \
  '.[] | select(.id == $id) | {
    id,
    name,
    description,
    version,
    lifecycleStatus,
    productSpecification
  }' \
  /tmp/product-offerings.json
```

成功后应返回类似：

```json
{
  "id": "urn:ngsi-ld:product-offering:400c9e16-0f8a-4b6f-842c-e456b1922aab",
  "name": "Building Energy Consumption Offering - 20260718130507",
  "description": "Access to BuildingEnergyReading data for demo 20260718130507",
  "version": "1.0.0",
  "lifecycleStatus": "ACTIVE",
  "productSpecification": {
    "id": "urn:ngsi-ld:product-specification:b3b4c89a-1803-40e7-8f46-8bd70626a509"
  }
}
```

其中：

```text
id
```

应等于：

```bash
echo "$PRODUCT_OFFERING_ID"
```

同时：

```text
productSpecification.id
```

应等于：

```bash
echo "$PRODUCT_SPEC_ID"
```

这说明 ProductOffering 已正确引用前一步创建的 ProductSpecification。

---

## 6.5 直接查询目标 ProductOffering

除了查询完整目录，也可以使用 ProductOffering ID 直接查询目标产品：

```bash
curl -k -x localhost:8888 -sS \
  -o /tmp/current-product-offering.json \
  -w "ProductOffering HTTP status: %{http_code}\n" \
  "https://mp-tmf-api.127.0.0.1.nip.io/tmf-api/productCatalogManagement/v4/productOffering/${PRODUCT_OFFERING_ID}" \
  -H "Authorization: Bearer ${ACCESS_TOKEN}"
```

预期结果：

```text
ProductOffering HTTP status: 200
```

随后查看关键字段：

```bash
jq '{
  id,
  name,
  description,
  version,
  lifecycleStatus,
  productSpecification
}' /tmp/current-product-offering.json
```

需要注意，只有接口返回 `200` 时才能使用 `jq` 解析响应。

如果接口返回 `401`，响应正文可能是普通文本而不是 JSON，直接执行 `jq` 会出现：

```text
jq: parse error
```

此时应先查看原始响应：

```bash
cat /tmp/current-product-offering.json
```

### 🖼️ Consumer 发现 ProductOffering 截图

```text
![[08-consumer-discover-product-offering.png|700]]
```

该结果说明：

1. Consumer 已通过有效 Access Token 完成身份认证；
2. Consumer 能够访问 TM Forum Product Catalog API；
3. Provider 新创建的 Building Energy ProductOffering 已进入产品目录；
4. Consumer 能够根据 ProductOffering ID 发现目标数据产品；
5. ProductOffering 正确引用本轮创建的 ProductSpecification。

至此，Provider 的产品发布和 Consumer 的目录发现流程已经完成：

```text
ProductSpecification 创建成功
        ↓
ProductOffering 创建成功
        ↓
Consumer 查询 Product Catalog
        ↓
HTTP 200
        ↓
发现 Building Energy ProductOffering
```


---

# Step 7 创建新的 Consumer Organization

Consumer 发现 Building Energy ProductOffering 后，需要先在 Provider 的客户管理系统中注册一个新的 Consumer Organization。

本 Demo 中：

```text
Consumer Organization：City Analytics Lab
Consumer Connector DID：did:web:fancy-marketplace.biz
```

Consumer Organization 是 TM Forum Party Management API 中的业务客户记录；Consumer DID 则是 Consumer Connector 的数字身份。

本步骤执行以下流程：

```text
准备 Representative Credential
        ↓
获取有效 Access Token
        ↓
设置 Consumer DID
        ↓
调用 TM Forum Party API
        ↓
创建 City Analytics Lab
        ↓
保存 CONSUMER_ORG_ID
```

---

## 7.1 检查 Representative Credential

创建 Organization 的用户需要使用 Representative Credential。

先检查当前 `REP_CREDENTIAL`：

```bash
echo "REP_CREDENTIAL length: ${#REP_CREDENTIAL}"
```

再判断它是否有效：

```bash
if [ -n "$REP_CREDENTIAL" ] && [ "$REP_CREDENTIAL" != "null" ]; then
  echo "REP_CREDENTIAL is available"
else
  echo "REP_CREDENTIAL is missing or invalid"
fi
```

如果 Credential 不存在或为 `null`，重新获取：

```bash
export REP_CREDENTIAL=$(
  ./doc/scripts/get_credential.sh \
    https://keycloak-consumer.127.0.0.1.nip.io \
    user-credential \
    representative
)
```

检查获取结果：

```bash
echo "REP_CREDENTIAL length: ${#REP_CREDENTIAL}"

if [ -n "$REP_CREDENTIAL" ] && [ "$REP_CREDENTIAL" != "null" ]; then
  echo "REP_CREDENTIAL obtained successfully"
else
  echo "REP_CREDENTIAL creation failed"
fi
```

正常情况下，Credential 长度应明显大于 4。

> 不要在截图或报告中显示完整 Credential。

---

## 7.2 获取 Organization 创建所需的 Access Token

使用 Representative Credential 获取 Provider 数据服务签发的 Access Token：

```bash
export ACCESS_TOKEN=$(
  ./doc/scripts/get_access_token_oid4vp.sh \
    https://mp-data-service.127.0.0.1.nip.io \
    "$REP_CREDENTIAL" \
    default
)
```

检查 Token 长度：

```bash
echo "ACCESS_TOKEN length: ${#ACCESS_TOKEN}"
```

继续判断 Token 是否有效：

```bash
if [ -n "$ACCESS_TOKEN" ] && [ "$ACCESS_TOKEN" != "null" ]; then
  echo "ACCESS_TOKEN obtained successfully"
else
  echo "ACCESS_TOKEN creation failed"
fi
```

只有看到：

```text
ACCESS_TOKEN obtained successfully
```

后，才能继续创建 Organization。

如果显示：

```text
ACCESS_TOKEN length: 4
```

通常说明：

```text
ACCESS_TOKEN=null
```

此时不能继续发送 Organization 创建请求，需要重新获取 `REP_CREDENTIAL` 和 `ACCESS_TOKEN`。

---

## 7.3 设置 Consumer DID

本地 FIWARE Consumer Connector 使用的 DID 为：

```bash
export CONSUMER_DID="did:web:fancy-marketplace.biz"
```

检查变量：

```bash
echo "CONSUMER_DID=${CONSUMER_DID}"
```

预期输出：

```text
CONSUMER_DID=did:web:fancy-marketplace.biz
```

虽然本 Demo 将业务组织命名为 `City Analytics Lab`，但底层仍然使用本地部署中 Consumer Connector 已配置的 DID。

因此：

```text
City Analytics Lab
= TM Forum 中的业务组织名称

did:web:fancy-marketplace.biz
= Consumer Connector 的数字身份
```

---

## 7.4 创建新的 Consumer Organization

为避免与以前创建的 Organization 混淆，在名称中加入本轮 `RUN_ID`：

```text
City Analytics Lab Demo ${RUN_ID}
```

执行以下命令创建 Organization，并将完整响应保存到临时文件：

```bash
curl -k -x localhost:8888 -sS \
  -o /tmp/create-consumer-organization.json \
  -w "Create Consumer Organization HTTP status: %{http_code}\n" \
  -X POST \
  "https://mp-tmf-api.127.0.0.1.nip.io/tmf-api/party/v4/organization" \
  -H "Accept: */*" \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer ${ACCESS_TOKEN}" \
  -d "{
    \"name\": \"City Analytics Lab Demo ${RUN_ID}\",
    \"partyCharacteristic\": [
      {
        \"name\": \"did\",
        \"value\": \"${CONSUMER_DID}\"
      }
    ]
  }"
```

创建成功后，预期返回：

```text
Create Consumer Organization HTTP status: 201
```

查看完整响应：

```bash
cat /tmp/create-consumer-organization.json | jq .
```

返回内容中应包含：

```text
id
name
partyCharacteristic
```

其中 `partyCharacteristic` 应保存：

```text
name: did
value: did:web:fancy-marketplace.biz
```

---

## 7.5 保存 Consumer Organization ID

从接口响应中提取 Organization ID：

```bash
export CONSUMER_ORG_ID=$(
  jq -r '.id // empty' \
    /tmp/create-consumer-organization.json
)
```

显示结果：

```bash
echo "CONSUMER_ORG_ID=${CONSUMER_ORG_ID}"
```

成功后应类似：

```text
CONSUMER_ORG_ID=urn:ngsi-ld:organization:xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
```

检查变量是否有效：

```bash
if [ -n "$CONSUMER_ORG_ID" ] && [ "$CONSUMER_ORG_ID" != "null" ]; then
  echo "Consumer Organization created successfully"
else
  echo "Consumer Organization creation failed"
fi
```

正常应输出：

```text
Consumer Organization created successfully
```

---

## 7.6 一条命令创建并自动保存 ID

确认 `ACCESS_TOKEN` 和 `CONSUMER_DID` 有效后，也可以按照此前 Demo 的方式，直接创建对象并自动保存 ID：

```bash
export CONSUMER_ORG_ID=$(
  curl -k -x localhost:8888 -sS \
    -X POST \
    "https://mp-tmf-api.127.0.0.1.nip.io/tmf-api/party/v4/organization" \
    -H "Accept: */*" \
    -H "Content-Type: application/json" \
    -H "Authorization: Bearer ${ACCESS_TOKEN}" \
    -d "{
      \"name\": \"City Analytics Lab Demo ${RUN_ID}\",
      \"partyCharacteristic\": [
        {
          \"name\": \"did\",
          \"value\": \"${CONSUMER_DID}\"
        }
      ]
    }" |
  jq -r '.id // empty'
)

echo "CONSUMER_ORG_ID=${CONSUMER_ORG_ID}"
```
---



### 🖼️ Consumer Organization 创建截图

```text
![[09-create-consumer-organization.png|700]]
```

该结果说明：

1. Consumer 使用 Representative Credential 完成身份认证；
2. Consumer 获得了访问 TM Forum Party API 的有效 Token；
3. City Analytics Lab 已注册到 Provider 的客户管理系统；
4. 新建 Organization 关联了 Consumer Connector DID；
5. 后续 ProductOrder 可以通过 `CONSUMER_ORG_ID` 引用该 Consumer。

至此，Consumer 注册流程完成：

```text
Representative Credential
        ↓
Access Token
        ↓
Consumer DID
        ↓
创建 City Analytics Lab Organization
        ↓
获得 CONSUMER_ORG_ID
```

下一步创建 ProductOrder 时，应引用：

```bash
${PRODUCT_OFFERING_ID}
```

和：

```bash
${CONSUMER_ORG_ID}
```


---

# Step 8 创建新的 ProductOrder

Consumer Organization 创建完成后，Consumer 使用本轮的 ProductOffering 和 Organization 创建 ProductOrder。

首先设置订单项 ID：

```bash
export ORDER_ITEM_ID="building-energy-order-item-${RUN_ID}"
```

检查需要引用的对象：

```bash
echo "PRODUCT_OFFERING_ID=${PRODUCT_OFFERING_ID}"
echo "CONSUMER_ORG_ID=${CONSUMER_ORG_ID}"
echo "ORDER_ITEM_ID=${ORDER_ITEM_ID}"
```

随后创建 ProductOrder：

```bash
curl -k -x localhost:8888 -sS \
  -o /tmp/create-product-order.json \
  -w "Create ProductOrder HTTP status: %{http_code}\n" \
  -X POST \
  "https://mp-tmf-api.127.0.0.1.nip.io/tmf-api/productOrderingManagement/v4/productOrder" \
  -H "Accept: application/json" \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer ${ACCESS_TOKEN}" \
  -d "{
    \"productOrderItem\": [
      {
        \"id\": \"${ORDER_ITEM_ID}\",
        \"action\": \"add\",
        \"productOffering\": {
          \"id\": \"${PRODUCT_OFFERING_ID}\"
        }
      }
    ],
    \"relatedParty\": [
      {
        \"id\": \"${CONSUMER_ORG_ID}\",
        \"role\": \"Buyer\"
      }
    ]
  }"
```

创建成功后，预期返回：

```text
Create ProductOrder HTTP status: 201
```

查看响应：

```bash
cat /tmp/create-product-order.json | jq .
```

从响应中保存 ProductOrder ID：

```bash
export PRODUCT_ORDER_ID=$(
  jq -r '.id // empty' \
    /tmp/create-product-order.json
)

echo "PRODUCT_ORDER_ID=${PRODUCT_ORDER_ID}"
```

检查是否创建成功：

```bash
if [ -n "$PRODUCT_ORDER_ID" ] && [ "$PRODUCT_ORDER_ID" != "null" ]; then
  echo "ProductOrder created successfully"
else
  echo "ProductOrder creation failed"
fi
```

### 🖼️ ProductOrder 创建截图

```text
![[10-create-product-order.png|700]]
```

截图中应包含：

```text
Create ProductOrder HTTP status: 201
ProductOrder ID
ProductOffering ID
Consumer Organization ID
Order Item ID
```

该结果说明 Consumer 已针对本轮 Building Energy ProductOffering 创建新的 ProductOrder。下一步将订单状态更新为 `completed`，并观察 Contract Management 日志。

# Step 9 将 ProductOrder 更新为 completed

先确认订单 ID 和 Token：

```bash
echo "PRODUCT_ORDER_ID=${PRODUCT_ORDER_ID}"
echo "ACCESS_TOKEN length: ${#ACCESS_TOKEN}"
```

更新订单状态：

```bash
curl -k -x localhost:8888 -sS \
  -D /tmp/complete-order-headers.txt \
  -o /tmp/complete-product-order.json \
  -w "Complete ProductOrder HTTP status: %{http_code}\n" \
  -X PATCH \
  "https://tm-forum-api.127.0.0.1.nip.io/tmf-api/productOrderingManagement/v4/productOrder/${PRODUCT_ORDER_ID}" \
  -H "Accept: application/json" \
  -H "Content-Type: application/json;charset=utf-8" \
  -d '{
    "state": "completed"
  }'
```

接口通常返回 `200` 或 `204`。随后查询订单：

```bash
curl -k -x localhost:8888 -sS \
  -o /tmp/current-product-order.json \
  -w "ProductOrder query HTTP status: %{http_code}\n" \
  "https://tm-forum-api.127.0.0.1.nip.io/tmf-api/productOrderingManagement/v4/productOrder/${PRODUCT_ORDER_ID}"
jq '{
  id,
  state,
  productOrderItem,
  relatedParty
}' /tmp/current-product-order.json
```

确认结果中包含：

```text
state: completed
```

### 🖼️ ProductOrder completed 截图

```text
![[11-product-order-completed.png|700]]
```

---

# Step 10 查看 Contract Management 日志

订单更新后，查看最近的 Contract Management 日志：

```bash
export KUBECONFIG="$(pwd)/target/k3s.yaml"

kubectl logs deployment/contract-management \
  -n provider \
  --since=10m |
grep -E \
"ProductOrderStateChangeEvent|Product order is completed|TilProductOrderHandler|ContractManagementProductOrderHandler"
```

预期出现：

```text
ProductOrderStateChangeEvent
Product order is completed.
TilProductOrderHandler responded 201 Created
ContractManagementProductOrderHandler responded 204 No Content
```

### 🖼️ Contract Management 日志截图

```text
![[12-contract-management-log.png|700]]
```

该日志证明订单完成事件已经被处理，但不能单独证明全部 ODRL 策略已经自动加载。

---

# Step 11 验证匿名访问

不携带 Token 请求本轮创建的数据：

```bash
curl -k -x localhost:8888 -sS \
  -o /tmp/anonymous-data-response.txt \
  -w "Anonymous request HTTP status: %{http_code}\n" \
  "https://mp-data-service.127.0.0.1.nip.io/ngsi-ld/v1/entities/${ENERGY_ENTITY_ID}"
```

预期返回：

```text
Anonymous request HTTP status: 401
```

查看响应：

```bash
cat /tmp/anonymous-data-response.txt
```

### 🖼️ 匿名请求 401 截图

```text
![[13-anonymous-request-401.png|650]]
```

---

# Step 12 重新获取 Token 并验证授权访问

订单完成后，重新获取 Access Token：

```bash
export ACCESS_TOKEN=$(
  ./doc/scripts/get_access_token_oid4vp.sh \
    https://mp-data-service.127.0.0.1.nip.io \
    "$REP_CREDENTIAL" \
    default
)
```

检查 Token：

```bash
if [ -n "$ACCESS_TOKEN" ] && [ "$ACCESS_TOKEN" != "null" ]; then
  echo "ACCESS_TOKEN obtained successfully"
else
  echo "ACCESS_TOKEN creation failed"
fi
```

随后测试授权请求：

```bash
curl -k -x localhost:8888 -sS \
  -o /tmp/authorized-data-response.json \
  -w "Authorized request HTTP status: %{http_code}\n" \
  -H "Authorization: Bearer ${ACCESS_TOKEN}" \
  "https://mp-data-service.127.0.0.1.nip.io/ngsi-ld/v1/entities/${ENERGY_ENTITY_ID}"
```

预期返回：

```text
Authorized request HTTP status: 200
```

### 🖼️ 授权请求 200 截图

```text
![[14-authorized-request-200.png|650]]
```

如果返回 `403`，应重新检查 Step 10 的 Contract Management 日志和策略配置。

---

# Step 13 Consumer 获取建筑能耗数据

查看授权请求返回的数据：

```bash
cat /tmp/authorized-data-response.json | jq .
```

也可以重新请求并直接格式化：

```bash
curl -k -x localhost:8888 -sS \
  -H "Authorization: Bearer ${ACCESS_TOKEN}" \
  "https://mp-data-service.127.0.0.1.nip.io/ngsi-ld/v1/entities/${ENERGY_ENTITY_ID}" |
jq .
```

返回结果应包含：

```text
id
type
buildingId
meterId
timestamp
energyKWh
unit
location
```

其中实体 ID 应等于：

```bash
echo "$ENERGY_ENTITY_ID"
```

### 🖼️ Consumer 获取数据截图

```text
![[15-consumer-building-energy-data.png|700]]
```

至此，本轮 Demo 完成：

```text
ProductOrder completed
        ↓
Contract Management 处理事件
        ↓
匿名访问返回 401
        ↓
Consumer 重新获取 Token
        ↓
授权访问返回 200
        ↓
获取 BuildingEnergyReading
```



---

## 五、Provider–Consumer 流程图

```text
![[provider-consumer-data-exchange.png|900]]
```

流程图展示：

```text
Provider 创建数据
        ↓
发布 ProductSpecification
        ↓
发布 ProductOffering
        ↓
Consumer 发现产品
        ↓
注册 Consumer Organization
        ↓
创建 ProductOrder
        ↓
ProductOrder completed
        ↓
Contract Management 处理事件
        ↓
Consumer 获取 Access Token
        ↓
APISIX + OPA + ODRL 授权
        ↓
Consumer 获取 BuildingEnergyReading
```

---

## 六、Demo 结果汇总

| Demo 步骤               | 预期结果               | 实际结果                     | 状态  |
| --------------------- | ------------------ | ------------------------ | --- |
| 启动 FIWARE 环境          | k3s 可恢复            | `~/start-fiware.sh` 成功   | 通过  |
| Kubernetes Node       | `Ready`            | Node 为 `Ready`           | 通过  |
| FIWARE 组件             | `Running`          | 关键组件正常                   | 通过  |
| Provider 数据源          | 可查询                | 返回 BuildingEnergyReading | 通过  |
| ProductOffering       | Consumer 可发现       | 成功查询目标 Offering          | 通过  |
| Consumer Organization | 已注册                | 成功查询 Organization        | 通过  |
| ProductOrder          | 状态完成               | `state = completed`      | 通过  |
| Contract Management   | 处理订单事件             | 收到 StateChangeEvent      | 通过  |
| TIL Handler           | 成功调用               | `201 Created`            | 通过  |
| Contract Handler      | 成功调用               | `204 No Content`         | 通过  |
| 匿名数据请求                | HTTP 401           | HTTP 401                 | 通过  |
| 授权数据请求                | HTTP 200           | HTTP 200                 | 通过  |
| Consumer 获取数据         | 返回能耗实体             | 成功返回                     | 通过  |
| 自动 ODRL Policy        | 自动生成               | 未直接查询确认                  | 待验证 |
| DSP Negotiation       | 产生 Agreement       | 未独立执行                    | 未覆盖 |
| DSP Transfer          | Transfer completed | 未独立执行                    | 未覆盖 |

---

## 七、Demo 流程总结

本 Demo 完整展示了 FIWARE Data Space Connector 中 Building Energy 数据产品的主要业务生命周期：

```text
Provider Data
      │
      ▼
ProductSpecification
      │
      ▼
ProductOffering
      │
      ▼
Consumer Discovery
      │
      ▼
Consumer Organization
      │
      ▼
ProductOrder
      │
      ▼
completed
      │
      ▼
Contract Management
      │
      ▼
Identity Authentication
      │
      ▼
Authorization
      │
      ▼
Protected Data Exchange
```

整个实验验证了以下能力：

1. Provider 能够保存和查询建筑能耗数据；
2. Provider 能够将数据服务发布为 ProductOffering；
3. Consumer 能够发现目标数据产品；
4. Consumer 能够以 Organization 身份创建 ProductOrder；
5. ProductOrder 能够进入 `completed` 状态；
6. Contract Management 能够处理订单完成事件；
7. 匿名请求会被系统拒绝；
8. 携带有效 Token 的 Consumer 可以访问受保护接口；
9. Consumer 最终能够获得 BuildingEnergyReading 数据。

---

## 八、结果边界与限制

虽然本 Demo 已成功完成产品发布、订单处理、身份认证和数据访问，但需要准确区分以下概念：

```text
ProductOrder
≠ DSP Contract Negotiation
```

```text
ProductOrder completed
≠ DSP Agreement
```

```text
HTTP 200
≠ DSP Transfer Process completed
```

本 Demo 当前证明的是：

> FIWARE DSC 中 TM Forum 产品订购、Contract Management、Credential 认证、API 授权和 NGSI-LD 数据访问已经形成一条可运行的主流程。

本 Demo 尚未独立证明：

* 两个 Connector 已通过 DSP Contract Negotiation 达成 Agreement；
* DSP Transfer Process 已进入 completed；
* ProductOrder 完成后 ODRL Policy 已完全自动创建；
* 订单取消后权限能够自动撤销；
* 下载后的数据使用义务能够被持续执行。

因此，本实验最准确的结论是：

> FIWARE Data Space Connector 已成功实现 Building Energy 数据产品从 Provider 发布、Consumer 发现和订购，到 Credential 认证、访问控制及数据获取的端到端演示。ProductOrder 完成事件已经得到 Contract Management 日志验证，但自动信任和策略配置的完整闭环仍需进一步查询目标组件确认。
