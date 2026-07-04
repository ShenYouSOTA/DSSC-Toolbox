# FIWARE DSC / FDF vs. TNO TSG 对比

## 结论速览

- **协议研究**：TNO TSG 更接近 IDS/IDSA 协议研究；FIWARE DSC 更接近工程化、DSBA 推荐的完整产品套件。
- **组件边界**：FIWARE DSC 把认证、授权、目录、合同、市场、数据面全部打包进一个 Helm Umbrella Chart；TNO TSG 只聚焦连接器核心（Core Container + Data Apps + Identity Provider/Metadata Broker 可选服务）。
- **教学 demo**：TNO TSG 更适合作为教学 demo，结构清晰、部署轻量、协议映射直接。

---

## 1. 是否更接近协议研究？

| 维度 | FIWARE DSC / FDF | TNO TSG |
|------|------------------|---------|
| 设计目标 | 提供可直接部署的“完整数据空间连接器平台” | 提供符合 IDS RAM 4.0 的连接器参考实现 |
| 与 IDS 协议关系 | 在 FDC + EDC 之上集成 OID4VC、TM Forum、DOME、Gaia-X 等生态 | 直接映射 IDS RAM 4.0 组件：Connector、Identity Provider、Metadata Broker、Clearing House、Vocabulary Hub、App Store |
| 协议抽象层 | 高：封装了 DID/VC、ODRL、NGSI-LD、TM Forum 等，用户不直接接触 IDS 消息 | 低：Data Apps 直接处理 IDS 消息，Core Container 负责 DAT/策略验证 |
| 学习价值 | 适合理解“企业级数据空间系统如何落地” | 适合理解“IDS 连接器协议如何工作” |

**结论**：TNO TSG 更接近协议研究。

---

## 2. 组件边界有什么不同？

### FIWARE DSC / FDF 的边界

一个 Helm Umbrella Chart 包含完整组织所需的所有组件，按角色启用：

- **认证**：Keycloak（发证）、VCVerifier、credentials-config-service、trusted-issuers-list
- **授权**：APISIX（PEP）、OPA（PDP）、ODRL-PAP（PAP/PRP）
- **目录/合同/市场**：TMForum-API、contract-management、BAE Marketplace Portal
- **DSP 控制面**：FDSC-EDC / Rainbow（Catalog、Contract Negotiation、Transfer Process）
- **数据面**：Scorpio（NGSI-LD Context Broker）、PostgreSQL、可扩展 S3/Kafka/REST
- **治理集成**：Gaia-X Trust Framework、EBSI TIR

边界特点：**认证、授权、目录、合同、DSP、数据服务全在一个部署单元内。**

### TNO TSG 的边界

只解决“连接器”本身，可选服务独立：

- **Core Container**：验证 DAT、执行策略、路由 IDS 消息
- **Data Apps**：处理业务逻辑的插件，直接消费 IDS 消息
- **Identity Provider（可选）**：CA + DAPS，颁发 DAT
- **Metadata Broker（可选）**：基于 Data App + Triple Store 的目录
- **Clearing House / Vocabulary Hub / App Store**：尚未实现或外部集成

边界特点：**核心小、周边可选，组件职责与 IDS RAM 4.0 一一对应。**

### 关键差异

| 对比点 | FIWARE DSC / FDF | TNO TSG |
|--------|------------------|---------|
| 打包范围 | 整个组织的连接器 + IAM + 市场 | 连接器核心 + 可选的 dataspace 服务 |
| 目录/合同 | TM Forum Open APIs + BAE Marketplace | IDS Metadata Broker + IDS Contract / DSP |
| 身份方案 | OID4VC（DID + VC/VP），兼容 EUDI Wallet | X.509 + DAPS（DAT），传统 IDS 路线 |
| 数据 API | NGSI-LD 原生，REST/S3/Kafka 可扩展 | 通过 Data Apps 抽象，不限定数据 API |
| 策略语言 | ODRL + OPA | 嵌入式 PEF，支持 IDS Usage Policies |

---

## 3. 哪个更适合作为教学 demo？

**推荐 TNO TSG。**

理由：

1. **架构更清晰**：Core Container + Data App 的拆分直接对应 IDS RAM 4.0 的 Connector 概念，学生容易建立“协议组件”心智模型。
2. **部署更轻**：Kubernetes/Docker Compose 即可，不需要 FIWARE DSC 那样 24GB+ RAM 的 k3s 全栈。
3. **协议映射更直接**：Data Apps 直接处理 IDS 消息，便于讲解 catalog、contract、transfer、DAT、usage policy 等核心协议流程。
4. **避免过度封装**：FIWARE DSC 把很多东西藏在 Helm Chart 和 OID4VC/TM Forum 抽象里，初学者会先被工程细节淹没。

**FIWARE DSC 更适合的场景**：

- 需要展示真实企业级部署（NGSI-LD、数字孪生、Gaia-X、DOME 兼容）
- 需要演示 Human-to-Machine 数字钱包流程
- 有足够时间和资源跑完整 k3s 本地环境

---

## 参考链接

- TNO TSG 文档：https://tno-tsg.gitlab.io/docs/overview
- TNO TSG GitLab：https://gitlab.com/tno-tsg
- FIWARE Data Space Connector：https://github.com/FIWARE/data-space-connector
- IDSA Data Space Connector Report：https://internationaldataspaces.org/idsa-data-space-connector-report/
