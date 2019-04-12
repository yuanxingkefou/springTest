package com.mq.dbcpPool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test()
    {
        String xmlPath="com/mq/jdbc/applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);

        AccountDao accountDao=(AccountDao) applicationContext.getBean("accountDao");
        System.out.println(accountDao.findAllUser());
    }
}
