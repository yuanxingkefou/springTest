package com.mq.aop.baseCglib;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
    public static UserServiceImpl createUserService()
    {
        //目标类
        final UserServiceImpl userService=new UserServiceImpl();
        //切面类
        final MyAspect myAspect=new MyAspect();

        //代理类
        //核心类
        Enhancer enhancer=new Enhancer();
        //确认父类
        enhancer.setSuperclass(userService.getClass());
        //设置回调函数,MethodInterceptor接口等效于InvocationHandler
        /**
         * param1,2,3和invoke函数一样
         * param4是代理类的方法
         */
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspect.before();
                Object obj=method.invoke(userService,objects);
                //代理类的父类即目标类，所以和上面语句是一致的
                methodProxy.invokeSuper(o,objects);
                myAspect.after();
                return obj;
            }
        });
        //创建代理
        UserServiceImpl proxyService=(UserServiceImpl)enhancer.create();
        return proxyService;
    }
}
