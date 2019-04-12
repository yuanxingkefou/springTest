package com.mq.base_Annocation;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Override
    public void save() {
        System.out.println("Dao");
    }
}
