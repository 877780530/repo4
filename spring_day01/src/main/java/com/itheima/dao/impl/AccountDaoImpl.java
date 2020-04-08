package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class AccountDaoImpl implements IAccountDao {
    private QueryRunner runner = null;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public List<Account> findAll() {
        try{
            List<Account> accounts = runner.query("select * from account", new BeanListHandler<Account>(Account.class));
            return accounts;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public Account findAccountByID(int id) {
        try{
            Account account = runner.query("select * from account where id = ?", new BeanHandler<Account>(Account.class),id);
            return account;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void saveAccount(Account account) {
        try{
            runner.update("insert into account(name,money) values (?,?)",account.getName(),account.getMoney());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void updateAccount(Account account) {
        try{
            runner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void deleteAccountByID(int id) {
        try{
            runner.update("delete from account where id=?",id);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
