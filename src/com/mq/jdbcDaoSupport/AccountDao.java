package com.mq.jdbcDaoSupport;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 通过继承JdbcDaoSupport来获得模板类JdbcTemplate
 */
public class AccountDao extends JdbcDaoSupport{

    public void findAllAccount()
    {
        String sql="select * from account";
        List<Account> list=this.getJdbcTemplate().query(sql, BeanPropertyRowMapper.newInstance(Account.class));

        for (Account item:list
             ) {
            System.out.println(item.toString());
        }
    }


}
