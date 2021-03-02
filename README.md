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
    客户端的负载均衡算法与服务的调用。提供一系列完善的配置项，如链接超时、重试，是一个软负载均衡的方式
```
#### Ribbon的负载均衡
```
集中式的LB：硬件的支持，Nginx
进程试的LB: 在程序中的 
```
### Ribbon的规则
#### 1、使用方法
```
    1、不能跟启动类同包名
    2、在启动类上添加注解@RibbonClient(value="服务名字"，configuration="规则类")
    3、在自定义规则类上添加注解@config，注入
    @config
    public class Myrule {
        @Bean 
        public IRule myRule () {
            return new RandomRule();
        }
    }
```
### OpenFeign
 ```
   服务的调用，针对于接口来说
```

### Gateway网关
```
    1、网关的动态配置
    以注册中心上的微服务为路径创建动态路由进行转发，从而实现路由动态 如图 网关动态配置.png
    
```
### Config
```
    集中、动态的配置管理，为各个不同的微服务应用的所有环境提供了一个中心化的外部配置
```
### Bus总线
````
    能管理和传播分布式系统间的消息，像一个分布式执行器，可用于广播状态更改，事件推送等，支持消息代理： RabbitMq和Kafka
````
