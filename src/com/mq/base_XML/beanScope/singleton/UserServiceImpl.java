package com.mq.base_XML.beanScope.singleton;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public void service() {
        System.out.println("UserServiceImpl");
    }
}
