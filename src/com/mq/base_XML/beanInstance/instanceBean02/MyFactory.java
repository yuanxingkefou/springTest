package com.mq.base_XML.beanInstance.instanceBean02;

public class MyFactory {
    public static UserService method()
    {
        return new UserServiceImpl();
    }
}
