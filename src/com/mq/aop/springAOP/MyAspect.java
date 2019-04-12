package com.mq.aop.springAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    //@Before("bean(userService)")
    public void before()
    {
        System.out.println("前置通知");
    }

    @Pointcut("execution(* com.mq.aop.springAOP.UserServiceImpl.*())")
    public void point(){}

    //@AfterReturning("execution(* com.mq.aop.springAOP.BookService.addBook(..))")
    public void afterReturning()
    {
        System.out.println("返回通知");
    }

    //@After("point()")
    public void after()
    {
        System.out.println("最终通知");
    }
    @Around("point()")
    public void around(ProceedingJoinPoint jp)
    {
        try {
            System.out.println("Around前置");
            jp.proceed();
            System.out.println("Around后置");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
