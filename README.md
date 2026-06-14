# DSSC-Toolbox

FIWARE Data Space Connector (FIWARE DSC) 项目文档 Wiki，由 zread 生成。

## 📖 文档查看方式

### 方式一：Obsidian（推荐）

1. 下载安装 [Obsidian](https://obsidian.md/)
2. 打开 Obsidian → 选择「打开本地文件夹」
3. 选择 `wiki/` 目录作为 Vault
4. 即可浏览所有 `.md` 文档，支持双向链接、图谱视图

### 方式二：Typora

1. 下载安装 [Typora](https://typora.io/)
2. 直接打开 `wiki/` 目录下的任意 `.md` 文件
3. 支持实时预览、导出 PDF/HTML

### 方式三：VS Code + Markdown 插件

1. 安装 [VS Code](https://code.visualstudio.com/)
2. 安装插件 `Markdown Preview Enhanced` 或 `Markdown All in One`
3. 打开 `wiki/` 目录，按 `Ctrl+Shift+V` 预览

### 方式四：zread 恢复

如果需要从 zread 恢复完整文档及版本历史：

```bash
# 使用 zread 工具恢复文档
zread restore <project-id>
```

> 💡 zread 会保留文档的版本历史和元数据信息

## 📁 目录结构

```
DSSC-Toolbox/
├── wiki/                        # Wiki 文档目录（32 篇）
│   ├── 1-xiang-mu-gai-shu.md           # 项目概述
│   ├── 2-kuai-su-bu-shu-zhi-nan.md     # 快速部署指南
│   ├── 3-consumer-jiao-se-bu-shu.md    # Consumer 角色部署
│   └── ...
└── DSSC_Tool_Learning/          # 学习资料
    ├── DSSC_Toolbox_Research_Task_Plan.md
    └── DSSC_Toolbox_Scenario.md
```

## 📝 文档索引

| 编号 | 文档 | 主题 |
|------|------|------|
| 01 | 项目概述 | FIWARE DSC 核心架构与功能 |
| 02 | 快速部署指南 | 部署流程与配置 |
| 03 | Consumer 角色部署 | 消费端部署详解 |
| 04 | Provider 角色部署 | 提供端部署详解 |
| 05 | 双角色部署 | Consumer + Provider 合一 |
| 06 | Operator 数据空间治理部署 | 运营方治理能力 |
| 07 | 组件总览与模块职责 | 各组件功能说明 |
| 08 | Helm Umbrella Chart 依赖图 | Helm 依赖关系 |
| 09 | OID4VC 认证框架 | VCVerifier、Trusted Issuers |
| 10 | H2M 服务调用流程 | Human-to-Machine 调用链 |
| 11 | M2M 服务调用流程 | Machine-to-Machine 调用链 |
| 12 | ODRL 授权框架 | APISIX + OPA + ODRL PAP |
| 13 | TM Forum Open APIs | 合同管理流程 |
| 14 | DSP 与 EDC 集成架构 | 数据空间协议集成 |
| 15 | Catalog 合同协商传输 | 协商流程与协议 |
| 16 | values.yaml 全局配置 | Helm 全局配置参考 |
| 17 | Keycloak + OID4VCI | 凭证签发配置 |
| 18 | 数字钱包兼容性 | 钱包集成方案 |
| 19 | Secret 管理与安全 | 生产环境安全管理 |
| 20 | Gaia-X 信任框架集成 | 信任框架对接 |
| 21 | Marketplace Portal BAE | 门户集成 |
| 22 | Central Marketplace | 中央市场集成 |
| 23 | AWS Garnet 框架集成 | AWS Garnet 对接 |
| 24 | OpenTelemetry 分布式追踪 | 追踪架构 |
| 25 | Grafana Tempo 追踪后端 | 集群内部追踪 |
| 26 | 各组件 OTel 接入说明 | 接入配置 |
| 27 | Helm Lint 模板渲染验证 | 语法检查 |
| 28 | Helm Unittest 套件 | 单元测试 |
| 29 | K3s 集成测试 | Maven + Cucumber |
| 30 | 8.x 版本说明 | 版本发布说明 |
| 31 | 9.x 版本说明 | 破坏性变更 |
| 32 | 10.x 版本说明 | Keycloak 迁移与 OID4VCI 重构 |

## 🔗 相关链接

- [FIWARE Data Space Components](https://github.com/FIWARE)
- [Eclipse Dataspace Components](https://eclipse-edc.github.io/docs/)
- [FIWARE DSC 官方文档](https://fiware-dsc.readthedocs.io/)

## 📄 许可证

本文档由 zread 自动生成，仅供学习参考。
