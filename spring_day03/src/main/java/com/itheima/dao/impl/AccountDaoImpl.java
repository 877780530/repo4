package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.utils.ConnectionUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;


public class AccountDaoImpl implements IAccountDao {
    private QueryRunner runner;
    ConnectionUtil connectionUtil;

    public void setConnectionUtil(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }



    @Override
    public List<Account> findAll() {
        try {
            List<Account> accounts = runner.query(connectionUtil.getThreadConnection(),"select * from account", new BeanListHandler<Account>(Account.class));
            return accounts;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account findByID(int accountID) {
        try {
            Account account = runner.query(connectionUtil.getThreadConnection(),"select * from account where id = ?", new BeanHandler<Account>(Account.class),accountID);
            return account;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAccount(Account account) {
        try {
            runner.update(connectionUtil.getThreadConnection(),"update account set name = ?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteAccountByID(int id) {
        try {
            runner.update(connectionUtil.getThreadConnection(),"delete from account where id=?",id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
