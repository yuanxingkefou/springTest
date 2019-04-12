package com.mq.base_XML.beanScope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    @org.junit.Test
    
    //原型：两个创建的对象不是同一个对象
    public void test01()
    {
        String xmlPath= "com/mq/base_XML/beanScope/prototype/applicationContext.xml";

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);

        UserService userService1=(UserService)applicationContext.getBean("userService");
        UserService userService2=(UserService)applicationContext.getBean("userService");
        
        System.out.println(userService1);
        System.out.println(userService2);
    }
}
