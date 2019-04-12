package com.mq.base_XML.beanLifestyle.beanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    @org.junit.Test
    public void test() throws Exception
    {
        String xmlPath= "com/mq/base_XML/beanLifestyle/beanPostProcessor/applicationContext.xml";

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);

        UserService userService=(UserService)applicationContext.getBean("userService");

        userService.service();

        //执行销毁方法
        applicationContext.getClass().getMethod("close").invoke(applicationContext);
    }
}
