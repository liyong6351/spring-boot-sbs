* 在创建多数据源的时候需要指定jdbc-url，不然会报错
* 两个事务出错:No qualifying bean of type 'org.springframework.transaction.PlatformTransactionManager' available: expected single matching bean but found 2: test1DataSourceTransactionManager,test2DataSourceTransactionManager] with root cause  
表示需要指定不同的事务
* 使用jta+atomikos解决简单的分布式事务的问题 


## Springboot监控
* 什么是Springboot监控中心
  针对为服务器监控，服务内存变化(堆内存、线程、日志管理等)、检测服务配置链接信息(比如redis，mysql等)
  统计当前拥有的bean(Spring容器中的bean)、统计SpringMVC@Requestmapping(统计http接口)
  Actuator监控应用(没有界面，返回JSON格式)  
  AdminUi 底层使用Actuator监控应用，实现可视化界面  
  应用场景:生产环境
* 为什么要用监控中心
Actuator是Spring boot的一个附加功能，可帮助你在应用程序生产环境时候见识和程序应用程序。可以使用HTTP的各种请求来监管，神级，手机应用的运行状况。特别对于微服务管理十分有意义。缺点:没有可视化界面
类似于JConsole

* actuator 的查看mapping地址为:  
/actuator/mappings  查看@RequestMapping的url列表  
/actuator/beans     查看所有的bean  
/actuator/env       陈列所有的环境变量  
/actuator/health    显示所有的环境变量  
/actuator/info      查看自定义应用信息  
/actuator/configprops