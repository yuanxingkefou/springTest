package com.mq.aop.baseJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {
    public static UserService createUserService()
    {
        //目标类
        final UserService userService=new UserServiceImpl();
        //切面类
        final MyAspect myAspect=new MyAspect();
        //代理类：将目标类和切面类结合
        /**
         * Proxy.newProxyInstance(ClassLoader,Interfaces,InvocationHandler);
         * 参数1：类加载器，当前类 .class.getClassLoader();目标类 .getClass().getClassLoader()
         * 参数2：interfaces 代理类需要的所有接口
         *        方法一：目标类实例 .getClass().getInterfaces();        只能获得自己接口，不能获得父类接口
         *        方法二：new Class[]{UserService.class}
         * 参数3：InvocationHandler 处理类，接口
         */
        UserService proxyService=(UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        myAspect.before();
                        //执行目标类的方法
                        Object obj=method.invoke(userService,args);
                        myAspect.after();
                        return obj;
                    }
                });
        return proxyService;
    }
}
