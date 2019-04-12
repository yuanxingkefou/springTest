package com.mq.transaction.AutoTransaction;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    //接收汇款

    @Autowired
    @Override
    public void in(String inner, int money) {
        this.getJdbcTemplate().update("update account set balance=balance+? where name=?",money,inner);
    }

    @Autowired
    @Override
    public void out(String outer, int money) {
        this.getJdbcTemplate().update("update account set balance=balance-? where name=?",money,outer);
    }
}
