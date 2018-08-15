package com.liyong.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration//注册到Spring容器中
@MapperScan(basePackages = "com.liyong.mapper.single", sqlSessionFactoryRef = "test2SqlSessionFactory")
public class DataSourceConfig2 {

    /***
     * 配置test1数据库
     * @return
     */
    @Bean("test2DataSource")
    @ConfigurationProperties(prefix = "spring.datasource2")
    public DataSource test2DataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * test1会话工厂
     *
     * @return
     */
    @Bean(name = "test2SqlSessionFactory")
    public SqlSessionFactory test2SqlSessionFactory(@Qualifier("test2DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        /**
         * bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/"));
         */
        return bean.getObject();
    }

    /**
     * 事务管理
     */
    @Bean(name = "test2DataSourceTransactionManager")
    public DataSourceTransactionManager test2DataSourceTransactionManager(@Qualifier("test2DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "test2SqlSessionTemplate")
    public SqlSessionTemplate test2SqlSessionTemplate(
            @Qualifier("test2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
