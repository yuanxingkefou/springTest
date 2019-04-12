package com.mq.jdbc;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

public class Test {
    @org.junit.Test
    public void test()
    {
        //1.创建数据源（连接池）dbcp
        BasicDataSource dataSource=new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bank");
        dataSource.setUsername("root");
        dataSource.setPassword("067931ma,.");

        //创建模板
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);

        //通过API操作
        jdbcTemplate.update("insert into account(id,name,balance) VALUES (?,?,?)","3","王五","1000");


    }
}
