* 在创建多数据源的时候需要指定jdbc-url，不然会报错
* 两个事务出错:No qualifying bean of type 'org.springframework.transaction.PlatformTransactionManager' available: expected single matching bean but found 2: test1DataSourceTransactionManager,test2DataSourceTransactionManager] with root cause  
表示需要指定不同的事务