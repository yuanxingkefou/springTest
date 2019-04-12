package com.mq.base_XML.beanScope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    @org.junit.Test
    
    //单例：两个创建的对象是同一个对象
    public void test01()
    {
        String xmlPath= "com/mq/base_XML/beanScope/singleton/applicationContext.xml";

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);

        UserService userService1=(UserService)applicationContext.getBean("userService");
        UserService userService2=(UserService)applicationContext.getBean("userService");
        
        System.out.println(userService1);
        System.out.println(userService2);
    }
}
