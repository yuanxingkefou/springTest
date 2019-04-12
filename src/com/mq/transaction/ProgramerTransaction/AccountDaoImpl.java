package com.mq.transaction.ProgramerTransaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
    //接收汇款

    @Override
    public void in(String inner, int money) {
        this.getJdbcTemplate().update("update account set balance=balance+? where name=?",money,inner);
    }

    @Override
    public void out(String outer, int money) {
        this.getJdbcTemplate().update("update account set balance=balance-? where name=?",money,outer);
    }
}
