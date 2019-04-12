package com.mq.aop.baseJDK;

public class Test {
    @org.junit.Test
    public void test()
    {
        UserService userService=MyBeanFactory.createUserService();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();


    }
}
