# springcloud2021
### 回顾springcloud

添加swagger

### Consul介绍

```
Consul是一套开源的分布式服务发现和配置管理系统，提供了微服务系统中的服务治理、配置中心、控制总线等动能，这些功能中的每个都可以根据需要单独使用。其优点：基于raft协议，比较简洁；支持健康检查，同时支持HTTP和DNS协议，支持数据中心的WAN集群提供图形界面。
    @Configuration
    public class ApplicationContextConfig
    {
        @Bean
        @LoadBalanced
        public RestTemplate getRestTemplate()
        {
            return new RestTemplate();
        }
    }

```
#### 注册中心的总结
```
在pom文件中添加对应的依赖，配置文件中设置对应的端口号以及服务名，消费者通过restTemplate进行远程调用， 在保证CPA的模式下的Euerka保证的是AP，zookeeper与consul保证的CP
```
### Ribbon介绍
```
    客户端的负载均衡算法与服务的调用。提供一系列完善的配置项，如链接超时、重试
```
#### Ribbon的负载均衡
```
集中式的LB：硬件的支持，Nginx
进程试的LB: 在程序中的 
```