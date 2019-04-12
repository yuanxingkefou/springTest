package com.mq.base_XML.beanType;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public void service() {
        System.out.println("UserServiceImpl");
    }
}
