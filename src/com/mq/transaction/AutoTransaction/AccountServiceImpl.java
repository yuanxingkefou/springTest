package com.mq.transaction.AutoTransaction;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Autowired
    private TransactionTemplate transactionTemplate;


    /**
     * 正常情况
     * @param outer
     * @param inner
     * @param money
     */
    @Transactional
    @Override
    public void transfer01(String outer, String inner, int money) {
        accountDao.out(outer,money);
        accountDao.in(inner,money);
    }

    /**
     * 两个业务逻辑之间发生错误
     * @param outer
     * @param inner
     * @param money
     */
    @Transactional
    @Override
    public void transfer02(String outer, String inner, int money) {
        accountDao.out(outer,money);
        //中间发生错误,数据库会发生错误，不能保证一致性
        int error=3/0;
        accountDao.in(inner,money);
    }

    /**
     * 编程式事务实现正常情况
     * @param outer
     * @param inner
     * @param money
     */
    @Override
    public void transfer03(String outer, String inner, int money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.out(outer,money);
                accountDao.in(inner,money);
            }
        });
    }

    /**
     * 编程式事务实现错误情况下的操作
     * 符合数据库的事务操作
     * @param outer
     * @param inner
     * @param money
     */
    @Override
    public void transfer04(String outer, String inner, int money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.out(outer,money);
                //中间模拟发生错误
                int i=3/0;
                accountDao.in(inner,money);
            }
        });
    }


}
