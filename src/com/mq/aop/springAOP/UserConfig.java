package com.mq.aop.springAOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class UserConfig {

    @Bean
    public UserService userService()
    {
        return new UserServiceImpl();
    }
}
