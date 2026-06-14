TM Forum Open APIs 是 FIWARE Data Space Connector 中实现产品目录管理和合同协商的核心组件。本文档详细阐述了如何通过 TM Forum 标准化 API 实现数据产品的全生命周期管理，包括产品规格定义、产品报价创建、订单处理以及与 IDSA 数据空间协议的合同协商集成。

## 概述与架构定位

TM Forum Open APIs 在数据空间连接器中扮演着产品目录管理和合同协商的基础角色。通过 [tmforum-api](https://github.com/FIWARE/tmforum-api) 和 [contract-management](https://github.com/FIWARE/contract-management) 通知监听器，FIWARE Data Space Connector 提供了一套完整的组件来执行基于 TM Forum 标准的合同管理。

该架构的核心价值在于实现了传统电信行业标准与现代数据空间协议的桥接。TM Forum API 提供了创建和管理产品与报价的标准化接口，而 Contract Management 组件则负责处理订单事件，并将其转化为数据空间中的权限配置。

![TM Forum Conceptual Model](./doc/img/tm_forum_conceptual_model.png)

## 核心 API 组件

FIWARE Data Space Connector 集成了多个 TM Forum Open APIs，每个 API 负责特定的管理功能。根据 [charts/data-space-connector/values.yaml](charts/data-space-connector/values.yaml#L1275-L1420) 的配置，系统部署了以下 API 组件：

| API 名称 | 基础路径 | 功能描述 |
|---------|---------|---------|
| party-catalog | /tmf-api/party/v4 | 组织和参与方管理 |
| product-catalog | /tmf-api/productCatalogManagement/v4 | 产品目录、规格、报价管理 |
| product-ordering-management | /tmf-api/productOrderingManagement/v4 | 产品订单处理 |
| quote | /tmf-api/quote/v4 | 报价协商管理 |
| agreement | /tmf-api/agreementManagement/v4 | 协议管理 |
| service-catalog | /tmf-api/serviceCatalogManagement/v4 | 服务目录管理 |

这些 API 通过统一的 API 代理（apiProxy）对外提供服务，并与 NGSI-LD 上下文代理（Scorpio）进行数据交互。每个 API 都可以通过 allInOne 模式部署为单体应用，也可以独立部署以实现更好的可扩展性。

## 合同管理流程详解

合同管理流程遵循从产品定义到服务访问的完整生命周期。整个流程涉及三个主要参与方：数据提供者（Provider）、数据消费者（Consumer）和合同管理服务（Contract Management）。

### 产品定义阶段

**第一步：创建产品规格（Product Specification）**

产品规格定义了数据产品的技术特性，包括服务端点、端点描述和允许的操作。在创建产品规格时，必须包含特定的 `productSpecCharacteristic` 字段，以便后续与 DCAT 进行映射：

```json
{
  "name": "Demo Spec",
  "productSpecCharacteristic": [
    {
      "id": "endpointUrl",
      "name": "Service Endpoint URL",
      "valueType": "endpointUrl",
      "productSpecCharacteristicValue": [{
        "value": "https://the-test-service.org",
        "isDefault": true
      }]
    },
    {
      "id": "endpointDescription",
      "name": "Service Endpoint Description",
      "valueType": "endpointDescription",
      "productSpecCharacteristicValue": [{
        "value": "The Test Service"
      }]
    }
  ]
}
```

**第二步：创建产品报价（Product Offering）**

产品报价将产品规格与定价策略和目录分类关联起来。报价是消费者在市场中看到和购买的商品形式：

```json
{
  "name": "Test Offering",
  "isBundle": false,
  "isSellable": true,
  "lifecycleStatus": "Active",
  "productSpecification": { "id": "${PRODUCT_SPEC_ID}" },
  "productOfferingPrice": [{ "id": "${PRICE_ID}" }],
  "category": [{ "id": "${CATEGORY_ID}" }]
}
```

### 订单处理阶段

**第三步：消费者注册**

消费者需要首先在市场中注册为组织（Organization），通过 Party API 创建组织实体：

```shell
curl -X POST 'http://tm-forum-api/tmf-api/party/v4/organization' \
  -H 'Content-Type: application/json' \
  -d '{
    "name": "Fancy Marketplace Inc.",
    "partyCharacteristic": [
      { "name": "did", "value": "${CONSUMER_DID}" }
    ]
  }'
```

**第四步：创建产品订单**

消费者通过 Product Ordering API 创建订单，购买数据产品的访问权限：

```shell
curl -X POST 'http://tm-forum-api/tmf-api/productOrderingManagement/v4/productOrder' \
  -H 'Content-Type: application/json' \
  -d '{
    "productOrderItem": [{
      "id": "random-order-id",
      "action": "add",
      "productOffering": { "id": "${OFFER_ID}" }
    }],
    "relatedParty": [{ "id": "${CONSUMER_ID}" }]
  }'
```

**第五步：订单完成与权限激活**

当订单状态变更为 "completed" 时，Contract Management 服务会收到通知，并执行以下操作：

1. 在 Trusted Issuers List 中添加消费者组织的条目，允许其签发 OperatorCredential
2. 根据产品规格中的策略配置，在 ODRL-PAP 中创建访问控制策略

## 状态机映射机制

FIWARE Data Space Connector 实现了 IDSA 数据空间协议状态机与 TM Forum Quote API 状态机之间的双向映射。这种映射确保了传统的电信业务流程能够与现代数据空间协议无缝集成。

![IDSA State Machine](./doc/img/idsa-contract-negotiation.png)

**IDSA 状态机定义：**
- **REQUESTED**：消费者请求合同，提供者已确认
- **OFFERED**：提供者向消费者发送报价，消费者已确认
- **ACCEPTED**：消费者接受最新报价，提供者已确认
- **AGREED**：提供者接受报价，向消费者发送协议，消费者已确认
- **VERIFIED**：消费者向提供者发送协议验证，提供者已确认
- **FINALIZED**：提供者发送最终确认，数据对消费者可用
- **TERMINATED**：任一方终止协商

![TM Forum State Machine](./doc/img/tmf-state-machine.png)

**TM Forum Quote 状态映射：**

| IDSA 状态 | TM Forum Quote 状态 | 触发动作 |
|-----------|-------------------|---------|
| REQUESTED | inProgress | Consumer 创建 Quote |
| OFFERED | inProgress | Provider 批准或添加新 QuoteItem |
| ACCEPTED | accepted | Consumer 接受报价 |
| AGREED | approved | Provider 批准协议 |
| TERMINATED | cancelled | 任一方取消 |

![Mapped State Machine](./doc/img/idsa-tmf-state-machine.png)

## DSP 协议集成

TM Forum Open APIs 与数据空间协议（DSP）的集成通过 FDSC-EDC 组件实现。FDSC-EDC 是 Eclipse Data Space Components 的实现，它使用 TM Forum API 作为存储后端，同时提供标准的 DSP 接口。

根据 [doc/DSP_INTEGRATION.md](doc/DSP_INTEGRATION.md#L1-L100) 的描述，这种集成支持两种认证模式：

**OID4VC 模式：** 使用 OpenID for Verifiable Credentials 协议进行连接器间的身份验证。该模式特别适用于与 EUDI Wallet 兼容的钱包集成，以及人机交互（H2M）场景。

**DCP 模式：** 使用 Decentralized Claims Protocol 进行身份验证。该模式通过 Identity Hub 实现去中心化的身份验证，支持机器对机器（M2M）的自动化交互。

产品规格中的 `productSpecCharacteristic` 字段包含了 DSP 集成所需的关键配置：

```json
{
  "id": "dcp",
  "name": "Endpoint for DCP negotiation",
  "valueType": "endpointUrl",
  "productSpecCharacteristicValue": [{
    "value": "https://dcp-provider.127.0.0.1.nip.io/api/dsp/2025-1"
  }]
}
```

## 授权与策略框架

TM Forum API 的访问控制通过 ODRL 授权框架实现。系统使用 APISIX 作为策略执行点（PEP），Open Policy Agent 作为策略决策点（PDP），ODRL-PAP 作为策略管理点。

关键策略文件位于 [it/src/test/resources/policies/](it/src/test/resources/policies/) 目录下，包括：

- **allowProductOrder.json**：允许创建产品订单
- **allowSelfRegistration.json**：允许组织自注册
- **allowContractManagement.json**：允许 Contract Management 发送订单通知
- **allowCatalogRead.json**：允许读取目录信息

策略使用 ODRL 格式定义，支持基于资源路径、凭证类型和角色的细粒度访问控制：

```json
{
  "odrl:permission": {
    "odrl:target": {
      "odrl:refinement": [{
        "odrl:leftOperand": "tmf:resource",
        "odrl:operator": "odrl:eq",
        "odrl:rightOperand": "productOrder"
      }]
    },
    "odrl:assignee": { "@id": "vc:any" },
    "odrl:action": { "@id": "odrl:use" }
  }
}
```

## 中心化市场集成

TM Forum Open APIs 支持中心化市场（Central Marketplace）集成模式。在这种模式下，数据提供者通过中心化市场发布和销售其数据产品，而不需要每个参与者都运行完整的市场基础设施。

根据 [doc/CENTRAL_MARKETPLACE.md](doc/CENTRAL_MARKETPLACE.md#L1-L80) 的描述，中心化市场集成流程包括：

1. **提供者注册**：在中心化市场注册为组织，包含 Contract Management 地址和认证信息
2. **产品发布**：通过 TM Forum API 创建产品规格和报价
3. **订单处理**：消费者在中心化市场购买产品
4. **通知分发**：中心化市场的 Contract Management 向提供者的 Contract Management 发送订单通知
5. **权限激活**：提供者的 Contract Management 更新 Trusted Issuers List 和 PAP 策略

这种架构降低了参与者的运营负担，同时保持了数据空间的安全性和互操作性。

## 配置参考

TM Forum API 的配置通过 Helm values 文件进行管理。以下是从 [charts/data-space-connector/values.yaml](charts/data-space-connector/values.yaml#L1275-L1420) 提取的关键配置选项：

| 配置项 | 默认值 | 说明 |
|-------|-------|------|
| tm-forum-api.enabled | true | 是否启用 TM Forum API |
| tm-forum-api.allInOne.enabled | false | 是否使用单体部署模式 |
| tm-forum-api.apiProxy.enabled | true | 是否启用 API 代理 |
| contract-management.enabled | true | 是否启用 Contract Management |

Contract Management 组件需要配置与 TM Forum API 各端点的连接信息：

```yaml
services:
  product-order:
    url: http://tm-forum-api:8080
  party:
    url: http://tm-forum-api:8080
  product-catalog:
    url: http://tm-forum-api:8080
  quote:
    url: http://tm-forum-api:8080
```

## 相关资源

- [DSP 与 EDC 集成架构](14-dsp-yu-edc-ji-cheng-jia-gou) - 了解 DSP 协议集成细节
- [Catalog / 合同协商 / 传输流程协议](15-catalog-he-tong-xie-shang-chuan-shu-liu-cheng-xie-yi) - 深入了解协议流程
- [ODRL 授权框架](12-odrl-shou-quan-kuang-jia-apisix-opa-odrl-pap) - 策略框架详细说明
- [Marketplace Portal 集成](21-marketplace-portal-bae-ji-cheng) - 市场门户集成指南