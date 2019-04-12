package com.mq.aop.baseCglib;

public class Test {
    @org.junit.Test
    public void test()
    {
        UserServiceImpl userService= MyBeanFactory.createUserService();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();


    }
}
