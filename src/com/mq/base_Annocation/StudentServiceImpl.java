package com.mq.base_Annocation;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public void show() {
        System.out.println("StudentServiceImpl");
    }
}
