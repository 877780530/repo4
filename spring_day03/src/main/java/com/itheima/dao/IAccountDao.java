package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface IAccountDao {
    public List<Account> findAll();

    public Account findByID(int accountID);

    public void updateAccount(Account account);

    public void deleteAccountByID(int id);
}
