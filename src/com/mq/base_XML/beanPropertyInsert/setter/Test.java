package com.mq.base_XML.beanPropertyInsert.setter;

import com.mq.base_XML.beanPropertyInsert.setter.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test()
    {
        String xmlpath= "com/mq/base_XML/beanPropertyInsert/setter/applicationContext.xml";

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);

        Person person=(Person)applicationContext.getBean("person");

        System.out.println(person.toString());
    }


}
