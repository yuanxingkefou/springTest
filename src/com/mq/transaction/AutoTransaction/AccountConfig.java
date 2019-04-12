package com.mq.transaction.AutoTransaction;

import com.mchange.v2.c3p0.DataSources;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AccountConfig {

    @Bean("dataSource")
    public BasicDataSource basicDataSource()
    {
        BasicDataSource dataSource=new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bank");
        dataSource.setUsername("root");
        dataSource.setPassword("067931ma,.");

        return dataSource;
    }
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(BasicDataSource dataSource)
    {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public JdbcTemplate jdbcTemplate()
    {
        return new JdbcTemplate();
    }

    @Bean
    public TransactionTemplate transactionTemplate()
    {
        return new TransactionTemplate();
    }
}
