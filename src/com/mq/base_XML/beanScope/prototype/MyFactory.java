package com.mq.base_XML.beanScope.prototype;

import org.springframework.beans.factory.FactoryBean;

public class MyFactory implements FactoryBean{
    @Override
    public Object getObject() throws Exception {
        return new UserServiceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
