package com.mq.transaction.AutoTransaction;

import com.mq.transaction.AnnotationTransaction.AccountService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * 自动装配还有问题
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.mq.transaction.AutoTransaction.AccountConfig.class)
public class Test {
    @Autowired
    private AccountService accountService;
    @org.junit.Test
    public void test()
    {
        accountService.transfer01("张三","李四",1000);
    }
}
