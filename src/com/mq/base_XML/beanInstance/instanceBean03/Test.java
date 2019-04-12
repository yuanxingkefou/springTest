package com.mq.base_XML.beanInstance.instanceBean03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    @org.junit.Test
    public void test()
    {
        String xmlPath= "com/mq/base_XML/beanInstance/instanceBean03/applicationContext.xml";

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);

        UserService userService=(UserService)applicationContext.getBean("userService");

        userService.service();
    }
}
