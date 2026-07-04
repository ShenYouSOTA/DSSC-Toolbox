# DSSC-Toolbox

FIWARE Data Space Connector (FIWARE DSC) 项目文档与研究工具箱。

## 项目概述

本项目包含：
- Wiki文档（32篇）：FIWARE DSC的完整技术文档
- DSSC_Tool_Learning：学习资料和研究任务设计
- DSSC_Minimal_Energy_Scenario：最小可复用研究场景
- data-space-connector：FIWARE DSC源码

## 研究方向

### A组：Data Exchange / Connector
- 工具：FIWARE FDF / TNO TSG
- 任务：数据发布、发现、访问协商和数据交换
- 演示：`demo/` 目录下的Python Mock演示

### B组：Trust / Compliance
- 工具：Gaia-X Compliance Service + Registry
- 任务：信任/合规验证流程

### C组：Semantic Model Governance
- 工具：Semantic Treehouse
- 任务：语义模型定义、维护和治理

### D组：Conformance / Validation
- 工具：ITB + SEMIC Validator
- 任务：一致性测试和验证

## 快速开始

### A组数据交换演示

```bash
cd demo
uv run python run_demo.py
```

### FIWARE DSC本地部署

```bash
cd data-space-connector
sudo modprobe br_netfilter
mvn clean deploy -Plocal
```

## 文档结构

- `wiki/` - 技术文档
- `DSSC_Tool_Learning/` - 学习资料
- `demo/` - Python演示代码
- `data-space-connector/` - FIWARE DSC源码

## 相关链接

- [FIWARE Data Space Components](https://github.com/FIWARE)
- [Eclipse Dataspace Components](https://eclipse-edc.github.io/docs/)
- [FIWARE DSC 官方文档](https://fiware-dsc.readthedocs.io/)
