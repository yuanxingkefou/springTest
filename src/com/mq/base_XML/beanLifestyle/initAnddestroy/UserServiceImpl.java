package com.mq.base_XML.beanLifestyle.initAnddestroy;

import org.springframework.stereotype.Component;

public class UserServiceImpl implements UserService {
    @Override
    public void service() {
        System.out.println("UserServiceImpl");
    }

    public void myInit()
    {
        System.out.println("初始化");
    }
    public void myDestroy()
    {
        System.out.println("销毁");
    }
}
