package com.mq.aop.springAOP;

import org.springframework.stereotype.Component;

@Component
public class BookService {
    public void addBook()
    {
        System.out.println("addBook()");
    }
}
