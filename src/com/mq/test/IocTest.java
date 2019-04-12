package com.mq.test;


import com.mq.UserService;
import com.mq.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.mq.config.UserConfig.class)
public class IocTest {
    @Test
    public  void test01()
    {
        UserServiceImpl test=new UserServiceImpl();
        test.service();
    }
    @Test
    public void test02()
    {
        String classPath="D:\\IntelliJ IDEA\\SpringTest\\web\\WEB-INF\\applicationContext.xml";
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext(classPath);
        UserService test=(UserServiceImpl)applicationContext.getBean("userServiceId");
        test.service();
    }
    @Autowired
    private UserService test03;
    @Test
    public void test03()
    {
//        assertNotNull(test03);
        test03.service();
    }
}
