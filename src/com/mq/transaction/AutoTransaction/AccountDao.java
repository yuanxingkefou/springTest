package com.mq.transaction.AutoTransaction;

public interface AccountDao {
    void in(String inner, int money);
    void out(String outer, int money);
}
