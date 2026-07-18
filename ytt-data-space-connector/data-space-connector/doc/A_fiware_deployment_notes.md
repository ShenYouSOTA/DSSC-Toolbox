FIWARE Data Space Connector Deployment Notes

1. 文档目的

本文记录 FIWARE Data Space Connector（FIWARE DSC）最小本地环境的部署过程，包括：

* 部署目标和环境；
* 软件依赖；
* 本地部署步骤；
* WSL 环境兼容性调整；
* 部署过程中出现的问题；
* 故障排查和恢复过程；
* Kubernetes 集群验证；
* Building Energy Consumption Demo 验证；
* 当前尚未完成或尚未严格验证的环节；
* 本地部署与生产环境之间的差异。

本文件主要记录**部署和运行状态**，系统架构说明参见：
A_connector_architecture.md

数据产品发布、订购和访问流程参见：
A_data_exchange_demo.md

2. 部署目标

本项目部署 FIWARE DSC 提供的本地 Minimum Viable Dataspace，用于研究：

1. Provider 和 Consumer 两类参与者；
2. Trust Anchor 和 Trusted Issuers Registry；
3. DID 和 Verifiable Credential；
4. ProductSpecification、ProductOffering 和 ProductOrder；
5. Contract Management；
6. ODRL Policy；
7. APISIX 和 OPA 授权；
8. Scorpio NGSI-LD 数据服务；
9. Consumer 对 Provider 数据的受控访问。

FIWARE 官方本地部署会在同一个 k3s 集群中部署两个 Connector 实例和一个 Trust Anchor，主要用于学习和开发，而不是生产环境。

本项目的最小业务场景为：

Building Energy Consumption Data Product

参与者包括：

| 角色          | 名称                      | 作用            
| Provider     | Energy Data Provider Ltd. | 发布建筑能耗数据产品    
| Consumer     | City Analytics Lab        | 发现、订购并访问数据    
| Trust Anchor | Local Trust Anchor        | 提供本地可信参与者注册能力 

3. 源代码版本

本地源代码目录：

DSSC_projects/data-space-connector

使用的仓库：

https://github.com/FIWARE/data-space-connector.git

本地实验所使用的版本信息：

Tag: 10.4.0
Commit: d70155351d6e2ae970a383851054362f90916f0b

可使用以下命令核对：

cd "$HOME/DSSC_projects/data-space-connector"

git describe --tags --always
git rev-parse HEAD
git status

由于本项目后期对 `checkRequirements.sh` 进行了 WSL 兼容性调整，因此部署目录可能显示该文件已修改。


4. 部署环境

4.1 主机环境

| 项目                 | 配置                                     
| Host OS            | Windows                                
| Linux environment  | WSL2 Ubuntu                            
| Project path       | `~/DSSC_projects/data-space-connector` 
| Container runtime  | Docker Desktop with WSL integration    
| Kubernetes         | k3s running inside Docker              
| Package/build tool | Maven                                  
| Java               | JDK 17 or higher                       
| Cluster client     | kubectl                                
| Shell              | Bash                                   

FIWARE 官方本地部署要求 Maven、JDK 17 以上版本和 Docker；`kubectl`、`curl`、`jq`、`yq`主要用于检查和操作系统。

4.2 工具版本检查

使用以下命令检查环境：

docker --version
kubectl version --client
curl --version
jq --version
yq --version
mvn --version
java -version

本项目还修改了：

doc/deployment-integration/local-deployment/checkRequirements.sh

修改目的包括：

* 正确识别 WSL2；
* 更稳定地解析各工具版本；
* 检查 Docker CLI 与 Docker daemon 是否都可用；
* 避免 WSL 内核无法正常显示 `br_netfilter` 模块时产生误判；
* 提供更清楚的 `[OK]`、`[WARN]`、`[MISSING]` 和 `[OLD]` 输出。

运行方式：

cd "$HOME/DSSC_projects/data-space-connector"

bash -n \
  doc/deployment-integration/local-deployment/checkRequirements.sh

bash \
  doc/deployment-integration/local-deployment/checkRequirements.sh

5. 网络与内核准备

FIWARE 本地部署在 Docker 容器中运行 k3s。官方文档提示，如果 `br_netfilter` 未启用，k3s 集群内部网络可能异常，最终导致 Connector 无法正常启动。

检查模块：

lsmod | grep br_netfilter

尝试启用：

sudo modprobe br_netfilter

检查内核参数：

sysctl net.bridge.bridge-nf-call-iptables
sysctl net.bridge.bridge-nf-call-ip6tables


WSL 环境中，`lsmod` 不一定能完整反映内核能力，因此还需要检查：


test -e /proc/sys/net/bridge/bridge-nf-call-iptables \
  && echo "Bridge netfilter available"

同时需要确认 Docker Desktop 已启动，并已启用当前 Ubuntu 发行版的 WSL Integration：

docker info
docker ps


如果 `docker --version` 正常，但 `docker info` 失败，说明只有 Docker CLI 可用，而 Docker daemon 尚未连接。

6. 本地部署步骤

6.1 进入仓库

cd "$HOME/DSSC_projects/data-space-connector"

6.2 执行环境检查

bash \
  doc/deployment-integration/local-deployment/checkRequirements.sh

6.3 启动本地数据空间

mvn clean deploy -Plocal


官方本地部署命令同样为：

mvn clean deploy -Plocal


部署成功后会生成：

target/k3s.yaml

该文件是连接本地 k3s 集群所需的 kubeconfig。

6.4 配置 kubectl

export KUBECONFIG="$HOME/DSSC_projects/data-space-connector/target/k3s.yaml"


也可以在当前仓库中使用：

export KUBECONFIG="$(pwd)/target/k3s.yaml"


确认：

echo "$KUBECONFIG"
kubectl get nodes


> `target/k3s.yaml` 包含集群访问配置，不应上传到公开仓库。

7. 部署尝试记录

7.1 第一次部署

第一次运行：

mvn clean deploy -Plocal


过程中部分基础组件成功启动，例如：

* Traefik；
* Provider DID；
* Consumer DID；
* Provider VC Operator；
* PostgreSQL；
* Provider APISIX；
* Trust Anchor TIR；
* Scorpio。

但多个组件较长时间未达到 Ready 状态，包括：

* `consumer-keycloak`；
* `provider/contract-management`；
* `provider/odrl-pap`；
* `provider/provider-keycloak`；
* `provider/trusted-issuers-list`；
* `provider/verifier`；
* Marketplace 相关组件。

部署日志显示，一部分组件陆续 Ready，但系统仍持续等待其余组件。

最终出现 Contract Management rollout 超时，Maven 部署失败。

初步原因分析

该失败并不表示所有组件均未部署，而是：

1. 部分 Pod 已经正常运行；
2. Maven 脚本等待所有目标组件 Ready；
3. 某些镜像拉取、初始化任务或依赖服务耗时过长；
4. Rollout 超过脚本允许的等待时间；
5. Maven 最终将整个部署标记为失败。

7.2 重置后的问题

在重置 Windows、WSL、Docker 或 k3s 环境后，曾出现：

consumer-keycloak ImagePullBackOff


说明 Kubernetes 无法正常拉取 Keycloak 镜像，可能原因包括：

* Docker Hub 或其他镜像仓库连接不稳定；
* WSL 与 Docker Desktop 网络中断；
* 镜像下载超时；
* DNS 解析异常；
* 镜像仓库临时限流。

还曾出现：

The connection to the server ... was refused


这表示当前 `kubectl` 指向的 k3s API Server 不可用，常见原因包括：

* k3s Docker 容器没有运行；
* Docker Desktop 尚未启动；
* `target/k3s.yaml` 对应的旧集群已被删除；
* `KUBECONFIG` 没有重新设置；
* WSL 重启后环境变量丢失。

排查命令：

docker ps -a
echo "$KUBECONFIG"
ls -l target/k3s.yaml
kubectl cluster-info

7.3 最终成功部署

后续部署最终返回：

BUILD SUCCESS


成功后不再重复执行 `mvn clean deploy -Plocal`，而是直接复用已生成的集群和 kubeconfig：

cd "$HOME/DSSC_projects/data-space-connector"

export KUBECONFIG="$(pwd)/target/k3s.yaml"

kubectl get nodes
kubectl get pods -A


最终状态包括：

* k3s Node 为 `Ready`；
* 大部分 Deployment 为 `Available`；
* PostgreSQL StatefulSet 为 `1/1`；
* Consumer Keycloak 为 `1/1`；
* Provider Keycloak 为 `1/1`；
* MongoDB 为 `1/1`；
* Business Ecosystem Logic Proxy 为 `1/1`；
* Trusted Issuers List 为 `1/1`；
* Verifier 为 `1/1`；
* Trust Anchor TIR 为 `1/1`。


8. Kubernetes 状态检查

部署完成后，使用以下命令检查集群。

8.1 Node

kubectl get nodes -o wide


预期：

STATUS = Ready


8.2 所有 Pod

kubectl get pods -A -o wide


重点检查：

STATUS
READY
RESTARTS
AGE


理想状态：

Running
Completed


异常状态包括：

Pending
CrashLoopBackOff
ImagePullBackOff
Error
Init:Error


8.3 Deployments

kubectl get deployments -A


8.4 StatefulSets

kubectl get statefulsets -A


8.5 Jobs

kubectl get jobs -A


8.6 Ingress

kubectl get ingress -A


8.7 查看异常日志

kubectl describe pod <pod-name> -n <namespace>

kubectl logs <pod-name> -n <namespace>

kubectl logs <pod-name> -n <namespace> --previous


针对 Deployment：

kubectl logs deployment/contract-management \
  -n provider \
  --tail=200


9. 本地 Ingress 和访问方式

本地部署使用 Traefik Ingress 和 `nip.io` 域名。

示例地址包括：

https://tir.127.0.0.1.nip.io
https://til.127.0.0.1.nip.io
https://keycloak-consumer.127.0.0.1.nip.io
https://keycloak-provider.127.0.0.1.nip.io
https://marketplace.127.0.0.1.nip.io
https://scorpio-provider.127.0.0.1.nip.io


Traefik 负责本地 Ingress，CoreDNS 将 `*.127.0.0.1.nip.io` 解析到 Traefik 的 LoadBalancer Service。

部分官方示例使用本地代理：

-x localhost:8888


例如查询可信 Issuer：

curl -k -x localhost:8888 \
  https://tir.127.0.0.1.nip.io/v4/issuers |
jq .


本地 Trust Anchor 会提供 Trusted Issuers Registry，默认部署的 Provider 和 Consumer 会注册为可信参与者。

10. Building Energy 数据服务验证

10.1 Provider 数据源

本项目使用 Scorpio NGSI-LD Co Broker 保存建筑能耗实体。

实体类型：

BuildingEnergyReading


数据包括：

* Building ID；
* Meter ID；
* 时间戳；
* 能耗值；
* 单位；
* 位置。

Provider 数据服务的基础接口为：

https://scorpio-provider.127.0.0.1.nip.io/ngsi-ld/v1


本地部署为了方便 Demo，直接暴露了 Scorpio API；官方文档明确说明，这类接口在生产环境中不应绕过身份与授权框架直接公开。

创建实体

curl -k -X POST \
  "https://scorpio-provider.127.0.0.1.nip.io/ngsi-ld/v1/entities" \
  -H "Content-Type: application/ld+json" \
  --data @building-energy-sample.json


查询实体

curl -k \
  "https://scorpio-provider.127.0.0.1.nip.io/ngsi-ld/v1/entities?type=BuildingEnergyReading"


本项目已验证 Provider 能够保存并返回 Building Energy 数据。

11. 产品目录验证

本项目为 Building Energy 数据创建了以下业务对象。

11.1 Product Offering

urn:ngsi-ld:product-offering:b2f608e2-262d-41ad-bebc-e367f1913bbb


11.2 Consumer Organization

urn:ngsi-ld:organization:8b79c3b2-afa3-4eaf-84c8-19bdbc497f57


11.3 Product Order

urn:ngsi-ld:product-order:33361d40-af51-452a-a507-bd7651e8bf16


订单 Item：

building-energy-order-item-20260704130107


ProductOrder 关联：

ProductOffering
→ Building Energy Consumption Dataset API

RelatedParty
→ Consumer Organization


创建订单后，订单状态被更新为：

completed


在 FIWARE 本地 Demo 中，接受 Offering 的业务过程最终表现为创建 ProductOrder；真实系统中，这一过程通常会由 Marketplace 页面封装，而不是要求用户直接调用 TM Forum API。

12. Contract Management 验证

ProductOrder 更新为 `completed` 后，Contract Management 收到了：

ProductOrderStateChangeEvent


日志中明确显示：

Product order is completed.


随后系统尝试从订单中解析 Credential 配置和 Policy。因为该订单未使用 Quote，系统使用原始 Product Offering 中的配置：

No quote found, take the original offer from the order item.


日志还显示两个关键 Handler 成功响应：

TilProductOrderHandler responded 201 Created
ContractManagementProductOrderHandler responded 204 No Content


这证明以下链路已经运行：

ProductOrder completed
        ↓
ProductOrderStateChangeEvent
        ↓
Contract Management
        ↓
TIL Handler
        ↓
Contract Management Handler


但是，该日志只能证明 Handler 调用成功，仍需分别查询目标组件，才能严格证明：

* Consumer DID 已正确写入 Trusted Issuers List；
* Credential 配置已正确创建；
* ODRL Policy 已正确写入 ODRL-PAP；
* OPA 已加载对应授权规则。

13. Authentication 与 Authorization 验证

本项目完成了两组对照测试。

13.1 匿名请求

不携带 Token 请求受保护的数据接口，系统返回：

HTTP 401 Unauthorized


说明 APISIX 或认证层能够拒绝未认证请求。

13.2 携带有效 Token

Consumer 完成 Credential 认证并获得 Access Token 后，再次请求数据接口，返回：

HTTP 200 OK


Consumer 能够获得 Building Energy 数据。

因此，本项目验证了：

No Token
→ 401

Valid Token
→ 200 + Building Energy Data


该结果说明身份认证和受保护数据访问已经基本跑通。

需要注意，HTTP 200 只能证明当前 Token 和当前策略能够通过，不足以单独证明 ProductOrder 自动生成了该策略。实验中还存在手动创建 ODRL Policy 的情况，因此自动合同闭环需要单独验证。

14. ODRL Policy

Provider 可以通过 ODRL-PAP 创建访问策略。

官方本地部署示例允许根据：

ngsi-ld:entityType


限制访问的实体类型，并通过：

odrl:assignee
odrl:action
odrl:target
odrl:constraint


定义谁可以对什么数据执行什么操作。

本项目的 Building Energy Policy 应至少表达：

Target:
BuildingEnergyReading

Action:
read

Assignee:
满足指定 Credential 或角色要求的 Consumer


示意结构：

json
{
  "@type": "odrl:Policy",
  "odrl:permission": {
    "odrl:action": {
      "@id": "odrl:read"
    },
    "odrl:target": {
      "@type": "odrl:AssetCollection",
      "odrl:refinement": {
        "@type": "odrl:Constraint",
        "odrl:leftOperand": "ngsi-ld:entityType",
        "odrl:operator": {
          "@id": "odrl:eq"
        },
        "odrl:rightOperand": "BuildingEnergyReading"
      }
    }
  }
}


15. 主要问题与解决方法

| 问题                                  | 表现                     | 原因分析                                    | 处理方法                                     
| Docker daemon 不可用                   | `docker info` 失败       | Docker Desktop 未启动或 WSL Integration 未启用 | 启动 Docker Desktop并启用 Ubuntu Integration  
| `br_netfilter` 不可见                  | 环境检查警告                 | WSL 内核模块显示方式与普通 Linux 不同                | 同时检查 `/proc/sys/net/bridge`              
| Pod 长时间未 Ready                      | Maven 一直等待             | 镜像、数据库、初始化 Job 或依赖组件耗时                  | 使用 `kubectl get pods -A` 和 `describe` 定位 
| Contract Management rollout timeout | Maven BUILD FAILURE    | 组件未在规定时间内 Ready                         | 查看 Pod、Deployment 和日志，不直接认定所有部署失败        
| `ImagePullBackOff`                  | Keycloak 等镜像无法拉取       | 网络、镜像仓库或 DNS 问题                         | 检查 Docker 网络并重新拉取                        
| kubectl connection refused          | 无法连接 API Server        | k3s 容器未运行或 kubeconfig 失效                | 检查 Docker 容器并重新设置 `KUBECONFIG`           
| WSL 重启后环境变量丢失                       | `kubectl` 使用错误配置       | `export` 只在当前 Shell 有效                  | 每次新终端重新 export                           
| 订单完成但策略状态不明确                        | Handler 成功，但 PAP 状态未知  | 日志不能代替目标组件查询                            | 分别查询 TIL、Credentials Config和 PAP         
| 匿名 API 被直接暴露                        | Demo 可直接访问 Scorpio/PAP | 本地部署为方便演示开放接口                           | 生产环境必须放在 IAM 和 Gateway 后面                

16. 本地部署的安全限制

FIWARE 官方明确指出，本地部署只用于学习和开发。它将两个参与者和 Trust Anchor 放在同一集群中，不代表真实数据空间的物理或组织隔离方式。

此外，为方便 Demo，部分接口被直接暴露，包括：

* Scorpio API；
* ODRL-PAP；
* TM Forum API；
* DID Helper；
* Trusted Issuers List 管理接口。

这些管理接口在真实环境中不应直接公开；官方文档也明确提醒，PAP 和 Scorpio 等接口在生产部署中必须置于认证和授权框架之后。

本地环境还使用：

127.0.0.1.nip.io
self-signed TLS
local Trust Anchor
demo credentials


因此不能将本实验结果直接解释为生产环境已经具备：

* 高可用；
* 灾难恢复；
* 密钥安全托管；
* 正式组织身份；
* 法律合规；
* 完整网络隔离；
* 生产级审计。

17. 不应上传到 Git 仓库的文件

以下文件包含密钥、Token 或本地集群访问信息，不应上传：

target/k3s.yaml
cert/private-key.pem
*.key
*.pem
*.p12
*.pfx
*.jwt
.env
.env.*
secrets/


特别是：

target/k3s.yaml


它是本地 Kubernetes kubeconfig，应视为敏感文件。

可以上传的内容包括：

部署命令说明
经过脱敏的日志
组件状态截图
错误分析
README
LOCAL-CHANGES.patch
修改后的脚本副本
不含敏感信息的配置示例


18. 当前完成状态

| 项目                            | 状态       
| FIWARE DSC 源代码获取              | 已完成      
| WSL 环境准备                      | 已完成      
| Docker 与 k3s 环境               | 已完成      
| Maven 本地部署                    | 已成功      
| Kubernetes Node Ready         | 已验证      
| 主要 Provider/Consumer 组件 Ready | 已验证     
| Trust Anchor TIR              | 已验证      
| Scorpio NGSI-LD 数据写入          | 已完成      
| BuildingEnergyReading 查询      | 已完成      
| ProductSpecification          | 已创建      
| ProductOffering               | 已创建      
| Consumer Organization         | 已创建      
| ProductOrder                  | 已创建      
| ProductOrder completed        | 已完成      
| Contract Management 收到事件      | 已验证      
| TIL Handler 201               | 已验证      
| Contract Handler 204          | 已验证      
| 匿名请求 401                      | 已验证      
| Token 请求 200                  | 已验证      
| 自动创建 TIL 配置                   | 尚需直接查询确认 
| 自动创建 ODRL Policy              | 尚需直接查询确认 
| DSP Contract Negotiation      | 尚未完整验证   
| DSP Transfer Process          | 尚未完整验证   
| 生产部署                          | 不在本项目范围内 

19. 后续验证建议

为证明 ProductOrder 到访问权限的自动闭环，应进一步完成：

19.1 查询 Trusted Issuers List

确认 Consumer DID 是否自动注册。

curl -k -x localhost:8888 \
  https://til.127.0.0.1.nip.io/issuer |
jq .


19.2 查询 Credentials Config

确认 ProductSpecification 中要求的 Credential 是否被写入目标服务配置。

19.3 查询 ODRL-PAP

确认 BuildingEnergyReading Policy 是否自动生成。

curl -k -x localhost:8888 \
  https://pap-provider.127.0.0.1.nip.io/policy |
jq .


19.4 验证拒绝场景

至少增加以下测试：

无 Token → 401
错误 Credential → 401 或 403
正确 Token 但不满足 Policy → 403
正确 Token 且满足 Policy → 200


19.5 验证撤销

将订单取消、合同终止或移除策略后，再次访问数据，确认权限是否及时撤销。

20. 部署结论

本项目最终在 Windows WSL2、Docker Desktop 和 k3s 环境中成功部署了 FIWARE Data Space Connector 的本地 Minimum Viable Dataspace。

部署过程中出现了：

* 组件 rollout 超时；
* Keycloak 镜像拉取失败；
* k3s API Server 无法连接；
* WSL 网络和内核兼容问题；
* Kubernetes 环境变量丢失等问题。

通过检查 Docker、重新配置 `KUBECONFIG`、观察 Kubernetes Pod 状态和组件日志，最终使主要组件达到可用状态。

在成功部署的基础上，本项目完成了 Building Energy Consumption 场景中的：

NGSI-LD 数据发布
→ ProductOffering 创建
→ Consumer Organization 创建
→ ProductOrder 创建与完成
→ Contract Management 事件处理
→ Token 认证
→ 受保护数据访问


实验已经证明 FIWARE DSC 能够将数据服务、产品目录、订单、身份认证和数据访问连接起来。

当前最主要的未完成部分是：

> 尚未通过目标组件查询严格证明 ProductOrder completed 后，Trusted Issuers List、Credentials Config 和 ODRL-PAP 已经自动形成完整授权闭环。

因此，本项目可以得出的准确结论是：

> FIWARE DSC 本地环境和 Building Energy 数据访问主流程已经成功运行；订单事件到 Contract Management 的链路已经得到日志验证，但自动信任和策略配置仍需进一步直接检查。
