package com.mq.transaction.AnnotationTransaction;

public interface AccountDao {
    void in(String inner, int money);
    void out(String outer, int money);
}
