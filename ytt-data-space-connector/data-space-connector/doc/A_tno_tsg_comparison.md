核心结论

## TNO TSG 是否更接近协议研究？

**相对 FIWARE DSC 而言，是的。**

但需要加一个限定：

> 当前 TNO TSG 不只是一个协议测试程序，而是一个完整的 Participant Agent，包含 Wallet、Control Plane、HTTP/Analytics Data Plane 和 SSO Bridge；只是它的架构中心仍然是 Dataspace Protocol、Participant Agent 交互、合同状态机和控制面—数据面分离。([TNO Security Gateway][2])

两者的核心差别可以概括为：

> **TNO TSG 从“参与者如何按照标准协议发现、协商和交换数据”出发；FIWARE DSC 从“一个组织如何把数据包装成产品、完成身份认证、订购、授权并最终访问服务”出发。**

因此：

* **研究 DSP 协议、状态机、互操作性：TNO TSG 更合适；**
* **研究完整数据产品业务闭环：FIWARE DSC 更合适；**
* **做入门教学 Demo：TSG Playground 通常更清楚、更轻；**
* **做工程型课程项目：FIWARE DSC 展示内容更完整，但部署明显更重。**

---

# 为什么 TNO TSG 更接近协议研究

## 1. Dataspace Protocol 是 TSG Control Plane 的中心

TSG 官方将 Control Plane 定义为数据空间交互的编排层，直接实现 Eclipse Dataspace Protocol，负责：

Registry
→ Catalog
→ Contract Negotiation
→ Agreement
→ Transfer Process


Control Plane 需要维护协商和传输的状态机，并协调 Wallet 与 Data Plane。([TNO Security Gateway][3])

它关注的主要对象是：

Participant
Catalog
Dataset
Distribution
DataService
ODRL Offer
Contract Negotiation
Agreement
Transfer Process


所以研究 TSG 时，最自然的问题是：

* Catalog 请求发送了什么？
* Dataset、Distribution 和 DataService 如何关联？
* Provider 提出的 Offer 包含什么 Policy？
* Consumer 如何发起 Negotiation？
* Provider 接受、拒绝或提出反向条件时，状态如何变化？
* Agreement 在什么时候正式产生？
* Agreement 与 Transfer Process 为什么不是同一件事？
* Control Plane 如何选择 HTTP Data Plane？
* 两个不同实现的 Participant Agent 能否互操作？

这类问题本质上都是**协议、对象模型和分布式状态机问题**。

TSG 当前文档称其 DSP 实现覆盖 Catalog、Contract Negotiation、Transfer Process 和 Registry，并把 DCAT、ODRL、DID、VC、DCP 等标准直接作为架构基础。([TNO Security Gateway][4])

---

## 2. TSG 的演示流程与协议阶段几乎一一对应

TSG 官方 Playground 的流程是：


发现 Bob
→ 请求 Bob 的 Catalog
→ 浏览 Dataset
→ 发起 Contract Negotiation
→ 查看 Negotiation History
→ 请求 Transfer
→ 通过 HTTP Data Plane 访问数据


Playground 中有 Authority Wallet，以及 Alice、Bob、Charlie 三个完整参与者；Negotiation 可以自动接受，学生可以直接观察数据交换生命周期，而不必先部署整套基础设施。([TNO Security Gateway][5])

这意味着课堂上每一步都能直接对应一个协议概念：

| Playground 操作              | 协议概念                             |
| -------------------------- | -------------------------------- |
| Discover Participant       | Registry / Participant discovery |
| Request Catalog            | Catalog Protocol                 |
| View Dataset               | DCAT Dataset / Distribution      |
| Negotiate Contract         | Contract Negotiation Protocol    |
| View completed negotiation | Agreement                        |
| Request Transfer           | Transfer Process Protocol        |
| Invoke backend             | Data Plane                       |

学生不容易把“产品下单”“用户注册”“Marketplace 页面”等业务流程和 DSP 状态机混在一起。

---

## 3. TSG 的控制面与数据面边界更干净

TSG 将组件清楚划分为：


Wallet
负责 DID、VC、VP、密钥和信任

Control Plane
负责 Catalog、Negotiation、Agreement、Policy、Transfer 协调

HTTP Data Plane
负责实际 HTTP API、文件、流式数据交换

Analytics Data Plane
负责多方分析工作流和事件协调

SSO Bridge
负责组织内部用户和组件的 OAuth/OIDC 认证


实际数据交换由 Data Plane 执行，Control Plane 只管理协议、合同和传输状态。([TNO Security Gateway][3])

因此，学生比较容易理解：


Control Plane：
是否允许交换、依据什么合同、传输处于什么状态

Data Plane：
实际通过哪个 API 或数据通道传输数据


---

## 4. TSG 更方便做互操作性研究

TSG 直接围绕标准对象组织：


DCAT 3
ODRL
DSP
DCP
DID
VC
OID4VCI
OID4VP
JSON-LD


因此可以比较自然地研究：

* TSG Consumer 能否读取其他 Connector 的 DSP Catalog；
* TSG 能否和 EDC、FIWARE DSC 等实现协商；
* 对方发送的 DCAT Dataset 是否能被正确解析；
* ODRL Policy 是否存在语义或约束差异；
* 双方的 Negotiation 状态转换是否一致；
* Transfer Process 的 endpoint、token 和数据面约定是否兼容。

所以“更接近协议研究”不是说 TSG 功能简单，而是说：

> **TSG 将标准协议对象和状态转换放在架构中心，外围商业模型较少，研究者更容易看到协议本身。**

---

# 四、FIWARE DSC 的架构中心是什么

FIWARE DSC 的边界明显比 TSG 更宽。

官方列出的主要框架包括：


OID4VC 身份认证框架
ODRL 授权框架
TM Forum 产品目录与合同管理
EDC / Dataspace Protocol
Marketplace Portal
HTTP、NGSI-LD、S3 等数据服务接入


它不仅实现 Catalog、Negotiation 和 Transfer，还管理 Product Specification、Product Offering、ProductOrder、Product Inventory，以及订单完成后如何配置身份信任和授权策略。([GitHub][1])

因此，FIWARE DSC 的典型故事是：


Provider 准备数据服务
→ 创建 Product Specification
→ 创建 Product Offering
→ Consumer 发现产品
→ Consumer 创建 ProductOrder
→ Provider 完成订单
→ Contract Management 处理通知
→ 配置可信身份和 ODRL Policy
→ Consumer 获取 Token
→ APISIX 和 OPA 判断权限
→ Consumer 访问 Scorpio / REST API


这已经不仅是 DSP，而是：

> **身份体系 + 产品体系 + 商业订单 + 合同 + 授权 + 数据服务。**

---

# 两者的组件边界有什么不同

## 1. 总体边界

### TNO TSG


┌───────────────────────────────┐
│ SSO Bridge                    │
│ 组织内部用户和组件认证         │
├───────────────────────────────┤
│ Wallet                        │
│ DID / VC / VP / Keys          │
├───────────────────────────────┤
│ Control Plane                 │
│ Registry / Catalog            │
│ Negotiation / Agreement       │
│ Policy / Transfer             │
├───────────────────────────────┤
│ HTTP / Analytics Data Plane   │
│ 实际数据交换                   │
├───────────────────────────────┤
│ Backend API / Data Source     │
└───────────────────────────────┘


### FIWARE DSC


┌───────────────────────────────────┐
│ Marketplace Portal                │
├───────────────────────────────────┤
│ TM Forum Product Management       │
│ Specification / Offering / Order  │
├───────────────────────────────────┤
│ Contract Management               │
├───────────────────────────────────┤
│ VC Authentication / Trust         │
│ Verifier / TIL / Keycloak         │
├───────────────────────────────────┤
│ ODRL Authorization                │
│ APISIX / OPA / ODRL-PAP           │
├───────────────────────────────────┤
│ EDC / Dataspace Protocol          │
│ Catalog / Negotiation / Transfer  │
├───────────────────────────────────┤
│ Scorpio / REST / S3 / NGSI-LD     │
└───────────────────────────────────┘


FIWARE 官方的组件清单包括 VCVerifier、Credentials Config Service、Trusted Issuers List、APISIX、OPA、ODRL-PAP、Keycloak、Scorpio、TM Forum API、Contract Management 和 PostgreSQL。([GitHub][1])

---

# 各层边界的详细比较

## 1. 身份和信任边界

### TNO TSG

TSG 把 **Wallet** 作为一等核心组件。

Wallet 自己负责：

* DID 创建和解析；
* 密钥管理；
* VC 签发、存储和验证；
* VP 创建和验证；
* OID4VC 与 DCP；
* Participant 的数字身份生命周期。

SSO Bridge 则单独负责组织内部用户和软件组件的 OAuth/OIDC 登录。([TNO Security Gateway][3])

因此，TSG 做了非常清楚的区分：


Wallet：
组织在外部数据空间中的身份

SSO Bridge：
组织内部用户和组件的登录身份


### FIWARE DSC

FIWARE 将身份功能拆成更多独立组件：


Keycloak
负责 Consumer 侧身份与 VC 签发

VCVerifier
验证 VC 并换取 Access Token

Credentials Config Service
记录访问某服务需要哪些 VC

Trusted Issuers List
记录可信签发者和凭证类型


其重点更偏向：

> 如何让人、设备或软件代理通过 OID4VC 完成服务调用。

FIWARE 同时支持 H2M 和 M2M 身份认证。([GitHub][1])

### 边界差异

* TSG：身份能力集中在一个完整 SSI Wallet 中；
* FIWARE：身份能力分布在 Verifier、Issuer、配置服务和信任列表之间；
* TSG 更容易讲“数字身份体系”；
* FIWARE 更容易讲“凭证如何转化为可调用业务 API 的 Token”。

---

## 2. Catalog 边界

### TNO TSG

TSG 的 Catalog 是典型的数据空间协议 Catalog：


Catalog
└── Dataset
    └── Distribution
        └── DataService


主要使用 DCAT 3 和 JSON-LD 表示。

它回答：

* 有什么数据集？
* 有哪些 Distribution？
* 数据服务地址是什么？
* 需要满足什么 Policy？

### FIWARE DSC

FIWARE 同时有两套 Catalog 视角。

第一套是业务产品 Catalog：


ProductSpecification
ProductOffering
ProductOfferingPrice
ProductInventory


第二套是 DSP Catalog：


DCAT Catalog
Dataset
Distribution
DataService
ODRL Offer


FIWARE 的 EDC 框架使用 TM Forum API 作为后端，并将产品模型暴露成 DSP 可理解的 Catalog、Dataset 和 Offer。([GitHub][1])

### 边界差异

TSG 主要关心：


“这个数据集如何通过标准协议被发现？”


FIWARE 还关心：


“这个数据服务如何被包装成商业产品、报价、销售和纳入库存？”


因此 FIWARE 的 Catalog 边界明显更宽。

---

## 3. 合同边界

### TNO TSG

核心是 DSP 合同状态机：


Offer
→ Contract Request
→ Negotiation
→ Agreement


Agreement 是协商结果。

之后再创建：


Transfer Process


因此 TSG 强调：


Agreement ≠ Transfer


一个是合同和使用条件，一个是具体数据交换会话。

### FIWARE DSC

FIWARE 同时存在两类合同过程。

#### TM Forum 业务流程


ProductOffering
→ Quote / Negotiation
→ ProductOrder
→ Product


#### DSP 协议流程


DCAT Offer
→ Contract Negotiation
→ Agreement
→ Transfer Process


此外，ProductOrder 完成后，Contract Management 可以接收事件，注册 Customer DID，并配置 ODRL 策略。([GitHub][1])

### 边界差异

| TSG             | FIWARE                               |
| --------------- | ------------------------------------ |
| 协议合同是主线         | 商业订单和协议合同同时存在                        |
| Agreement 是核心结果 | ProductOrder、Product、Agreement 都可能出现 |
| 更容易观察 DSP 状态机   | 更接近真实产品购买和服务开通过程                     |
| 概念较集中           | 初学者容易混淆 Order 和 Agreement            |

---

## 4. 授权与策略边界

### TNO TSG

Policy 主要位于：


Dataset Offer
Contract Negotiation
Agreement
Control Plane Policy Evaluation
Transfer-level Access Control


Control Plane 根据参与者 Credential 和 Policy 决定是否达成 Agreement，HTTP Data Plane 根据 Agreement 和 Transfer Token 执行实际数据访问。([TNO Security Gateway][3])

### FIWARE DSC

FIWARE 将授权系统显式拆成标准 ABAC 组件：


APISIX = PEP
OPA = PDP
ODRL-PAP = PAP/PRP


授权可以考虑：

* JWT 中的 VC claims；
* HTTP 操作；
* 请求路径；
* 请求体中的数据字段；
* 环境和上下文条件。

APISIX 拦截请求，OPA 根据 ODRL Policy 决策，最后再决定是否转发给后端服务。([GitHub][1])

### 边界差异

TSG 更偏：


“这个 Agreement 和 Transfer 是否允许数据交换？”


FIWARE 更偏：


“这个具体 HTTP 请求，针对这个路径、操作和数据字段，是否允许执行？”


所以 FIWARE 的服务级、字段级授权表现得更显式。

---

## 5. 数据面边界

### TNO TSG

TSG 明确提供可替换的数据面：

* HTTP Data Plane；
* Analytics Data Plane；
* 未来可以增加其他 Data Plane。

HTTP Data Plane 负责 API、文件、流数据以及代理后端 HTTP 服务；Analytics Data Plane 负责协调多方分析、联邦学习等事件工作流，但不一定亲自执行分析计算。([TNO Security Gateway][3])

### FIWARE DSC

FIWARE 的数据服务接入范围更广，官方说明可管理各种 HTTP 接口，内置兼容 NGSI-LD，同时可接入：

* REST API；
* S3；
* NGSIv2；
* Web Portal；
* AI Agent 的 A2A/MCP 服务等。([GitHub][1])

FIWARE 还直接打包 Scorpio Con Broker，使 NGSI-LD 数据管理成为其典型场景。

### 边界差异

* TSG 更强调 Data Plane 是一个独立、可替换的执行层；
* FIWARE 更强调将已有服务或 Con Broker 纳入完整产品和授权体系；
* TSG 的 Data Plane 抽象更适合研究“协议如何协调传输”；
* FIWARE 更适合研究“一个真实 API 如何被产品化和受控暴露”。

---

## 6. Marketplace 和商业管理边界

### TNO TSG

当前 TSG 的核心架构中没有把完整商业 Marketplace 作为中心组件。

它主要提供：


Participant
Catalog
Dataset
Policy
Agreement
Transfer


可以有上层门户调用 TSG，但 Marketplace 不是协议内核。

### FIWARE DSC

Marketplace 是官方框架中的重要组成部分，可通过图形界面管理：

* Product Specification；
* Product Offering；
* 合同；
* 订单；
* Product Inventory。([GitHub][1])

### 边界差异

这也是两者最明显的定位差异：

> **TSG 更接近参与者间协议基础设施，FIWARE 更接近数据产品交易与服务交付平台。**

---

# 概念对象映射

以你的 Building Energy 数据为例：

| 业务概念   | TNO TSG                    | FIWARE DSC                                 |
| ------ | -------------------------- | ------------------------------------------ |
| 数据产品   | DCAT Dataset               | ProductSpecification                       |
| 提供方式   | Distribution / DataService | ProductOffering + ServiceSpecification     |
| 使用条件   | ODRL Offer                 | ProductOffering 条件 + ODRL Policy           |
| 产品发现   | DSP Catalog                | Marketplace/TM Forum Catalog 或 DSP Catalog |
| 消费申请   | Contract Request           | ProductOrder 或 DSP Contract Request        |
| 协商过程   | Contract Negotiation       | Quote/ProductOrder 流程或 DSP Negotiation     |
| 最终协议   | Agreement                  | Product/Order 合同状态或 DSP Agreement          |
| 具体访问会话 | Transfer Process           | DSP Transfer 或 Token 化服务访问                 |
| 实际 API | HTTP Data Plane Backend    | Scorpio/NGSI-LD/REST/S3                    |
| 身份     | TSG Wallet、DID、VC          | Keycloak、VCVerifier、TIL                    |
| 访问执行   | Control Plane + Data Plane | APISIX + OPA + ODRL-PAP                    |

这一表也说明为什么不能简单地把：


ProductOrder = Contract Negotiation


或者：


ProductOrder completed = DSP Agreement


它们属于不同抽象层：

* ProductOrder 是业务订购过程；
* Agreement 是 DSP 协议中的使用合同；
* Transfer Process 是基于 Agreement 创建的交换会话。

---

# 哪个更适合作为教学 Demo

答案取决于教学目标。

## 目标一：讲清楚数据空间协议

### 推荐：TNO TSG

如果课程想让学生理解：

* Participant Agent 是什么；
* Catalog 如何发现；
* DCAT Dataset 是什么；
* ODRL Offer 怎样进入协商；
* Contract Negotiation 状态如何变化；
* Agreement 与 Transfer 的区别；
* Control Plane 和 Data Plane 如何分工；

那么 **TNO TSG 更适合**。

原因如下。

### 1. 流程与协议一一对应


Registry
→ Catalog
→ Negotiation
→ Agreement
→ Transfer
→ HTTP Data Plane


概念不容易被 Marketplace、ProductOrder 和库存管理干扰。

### 2. 官方 Playground 可以直接使用

无需先安装 Kubernetes、Keycloak、Scorpio、APISIX、OPA 等组件，就可以体验完整生命周期。

Playground 本身就是官方为学习、演示和集成测试准备的环境。([TNO Security Gateway][5])

### 3. 状态机更可见

学生可以看到：


Negotiation ID
Agreement
Transfer ID
Transfer 状态
Dataset Policy


适合讲协议和调试。

### 4. 控制面与数据面清楚

先形成 Agreement，再启动 Transfer，最后访问 Backend，层次非常明确。

### TSG 的教学缺点

* 商业故事相对弱；
* 主要是 Dataset，而不是容易理解的“商品下单”；
* UI 和对象命名偏技术；
* ODRL、DCAT、VC 和 DSP 对初学者仍有概念门槛；
* 自动接受 Negotiation 会隐藏实际多轮协商细节，进阶课程还需查看 API 和状态历史。

---

## 目标二：讲完整的数据产品业务闭环

### 推荐：FIWARE DSC

如果课程想展示：


数据如何变成产品
→ 如何发布 Offering
→ Consumer 如何下单
→ 订单怎样开通权限
→ Token 如何获得
→ API 如何被保护
→ 最后怎样获得数据


那么 FIWARE DSC 更合适。

它更贴近学生熟悉的业务体验：


产品
→ 商品报价
→ 下单
→ 开通服务
→ 登录认证
→ 访问 API


### FIWARE 的教学优点

1. **业务故事直观**
   Product Specification、Offering、Order 很容易类比电商和 API 商店。

2. **安全链条完整**
   可以演示身份认证、Token、401、403、200 等结果。

3. **数据服务真实**
   可以直接使用 Scorpio、NGSI-LD 或已有 REST API。

4. **适合展示多层架构**
   身份、产品、合同、策略、数据分别由不同组件负责。

### FIWARE 的教学缺点

FIWARE 的完整部署是 Helm Umbrella Chart，需要配置：

* Trust Anchor；
* DID 和密钥；
* VC 类型；
* DNS/Ingress；
* 组件内部地址；
* 数据库；
* Kubernetes。

官方明确说明，不提供有效配置的默认 Helm 安装无法正常工作；本地部署还会利用 k3s 和 Docker 启动完整数据空间。([GitHub][1])

因此学生很容易把大量时间花在：


ImagePullBackOff
Keycloak
TLS
DNS
Ingress
数据库
Pod readiness


而不是数据空间概念。

---

# 教学 Demo 适用性对比

| 教学维度               | TNO TSG               | FIWARE DSC              |
| ------------------ | --------------------- | ----------------------- |
| DSP 协议教学           | **非常适合**              | 适合，但容易被其他层干扰            |
| Negotiation 状态机    | **非常清晰**              | 有 DSP，但还存在 ProductOrder |
| Control/Data Plane | **边界清晰**              | 支持，但组件链更复杂              |
| 数据产品商业流程           | 较弱                    | **非常适合**                |
| 身份与 VC 教学          | 适合，Wallet 集中          | 适合，组件更分散                |
| API 授权教学           | Transfer 级安全较清楚       | **APISIX/OPA/ODRL 更直观** |
| Marketplace 展示     | 非核心                   | **有明确门户和产品模型**          |
| 无部署快速演示            | **官方 Playground 很适合** | Quick Start 仍需本地部署      |
| 工程架构教学             | 中等                    | **非常丰富**                |
| 初学者认知负担            | 较低到中                  | 中到高                     |
| 部署风险               | 使用 Playground 时低      | 本地完整部署较高                |
| 课程项目扩展性            | 协议与互操作方向强             | 业务集成与工程方向强              |

---

# 对你们 Building Energy 项目的具体建议

你们任务书原本就建议：

* FIWARE 作为端到端数据交换主线；
* TNO TSG 作为 Dataspace Protocol 和 Participant Agent 机制分析辅线。

这个安排是合理的，但建议把两者的教学职责分得更清楚。

## TNO TSG 负责回答“协议怎么运行”

把 Building Energy 映射成：


Dataset:
Building Energy Consumption Dataset

Distribution:
JSON REST API

DataService:
Provider HTTP endpoint

Policy:
Only authorized participants may access


然后展示：


Consumer 请求 Provider Catalog
→ 找到 Building Energy Dataset
→ 查看 ODRL Offer
→ 发起 Contract Negotiation
→ 获得 Agreement
→ 创建 Transfer Process
→ HTTP Data Plane 调用 API


重点记录：


Participant ID
Catalog ID
Dataset ID
Offer / Policy
Negotiation ID
Agreement ID
Transfer ID
Transfer 状态


---

## FIWARE 负责回答“数据如何产品化并真正开通”

把相同数据映射成：


BuildingEnergyReading
→ ProductSpecification
→ ProductOffering
→ Consumer Organization
→ ProductOrder
→ completed
→ Contract Management
→ TIL / ODRL Policy
→ VC Token
→ APISIX / OPA
→ 数据访问


重点记录：


ProductSpecification ID
ProductOffering ID
Customer Organization DID
ProductOrder ID
订单状态
Contract Management 日志
Policy
匿名请求 401
授权请求 200


---


# 最终判断

## 单纯问“哪个更适合作为教学 Demo”

对于一个第一次学习数据空间、重点是理解 Connector/DSP 的班级：

> **TNO TSG Playground 更适合。**

原因是：

* 不必先部署完整基础设施；
* Catalog、Negotiation、Agreement、Transfer 顺序清楚；
* Participant Agent、Control Plane 和 Data Plane 边界明确；
* 协议对象和状态可以直接观察；
* 不会被产品订单、Marketplace 和多种安全组件分散注意力。

## 问“哪个更适合做完整课程项目”

> **FIWARE DSC 更适合。**

因为它能同时覆盖：

* 数据管理；
* 数据产品化；
* 身份与信任；
* 商业订单；
* 合同；
* ODRL 授权；
* API Gateway；
* 实际数据访问。

但必须控制部署范围，否则课程很容易退化成 Kubernetes 运维实验。

## 针对你们现有项目

> **继续以 FIWARE DSC 作为主工程 Demo，以 TNO TSG 作为协议对照和教学解释工具，是最合理的方案。**

最准确的总结是：

> **TNO TSG 更接近协议和 Participant Agent 研究，其边界围绕 Wallet、DSP Control Plane 和可插拔 Data Plane；FIWARE DSC 的边界则扩展到 Marketplace、TM Forum 产品目录、订单、身份认证、ODRL 授权和实际数据服务。讲 DSP 时选择 TSG，讲完整数据产品业务闭环时选择 FIWARE；对于本项目，FIWARE 负责“跑通”，TSG 负责“讲清楚”。**

[1]: https://github.com/FIWARE/data-space-connector "GitHub - FIWARE/data-space-connector: FIWARE Data Space Connector following DSBA TC recommendations · GitHub"
[2]: https://tsg.dataspac.es/ "TNO Security Gateway"
[3]: https://tsg.dataspac.es/docs/architecture/components/ "Components | TNO Security Gateway"
[4]: https://tsg.dataspac.es/docs/architecture/standards-protocols "Standards and Protocols | TNO Security Gateway"
[5]: https://tsg.dataspac.es/docs/playground/ "TSG Playground | TNO Security Gateway"
