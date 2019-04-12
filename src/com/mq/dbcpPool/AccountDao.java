package com.mq.dbcpPool;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate=jdbcTemplate;
    }
    public List<Account> findAllUser()
    {
        String sql="select * from account";

        final List<Account> list=new ArrayList<>();

        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                Account account=new Account();

                account.setId(Integer.parseInt(resultSet.getString("id")));
                account.setName(resultSet.getString("name"));
                account.setBalance(Integer.parseInt(resultSet.getString("balance")));
                list.add(account);
            }

        });
        return list;
    }

}
