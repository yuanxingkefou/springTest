package com.mq.base_Annocation;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.mq.base_Annocation.StudentConfig.class)
public class Test {
    @Autowired
    private StudentAction studentAction;
    @org.junit.Test
    public void test()
    {
        studentAction.execute();
    }
}
