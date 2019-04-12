package com.mq.jdbcDaoSupport;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    @org.junit.Test
    public void test()
    {
        String xmlPath="com/mq/jdbcDaoSupport/applicationContext.xml";

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);

        AccountDao accountDao=(AccountDao) applicationContext.getBean("accountDao");

        accountDao.findAllAccount();
    }
}
