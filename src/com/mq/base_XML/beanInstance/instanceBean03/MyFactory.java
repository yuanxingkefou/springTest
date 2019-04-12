package com.mq.base_XML.beanInstance.instanceBean03;

public class MyFactory {
   public UserService method()
   {
       return new UserServiceImpl();
   }
}
