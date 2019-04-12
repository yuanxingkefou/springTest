package com.mq.transaction.AnnotationTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test()
    {
        String xmlPath= "com/mq/transaction/AnnotationTransaction/applicationContext.xml";

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);

        AccountService accountService=(AccountService) applicationContext.getBean("accountService");

        accountService.transfer01("张三","李四",1000);
    }
}
