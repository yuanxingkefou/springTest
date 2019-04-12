package com.mq;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public void service() {
        System.out.println("UserServiceImpl");
    }
}
