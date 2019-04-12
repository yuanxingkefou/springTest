package com.mq.aop.springAOP;

import com.mq.aop.baseJDK.MyBeanFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserConfig.class)
public class Test {
    @Autowired
    private UserService userService;
    @org.junit.Test
    public void test()
    {
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }
}
