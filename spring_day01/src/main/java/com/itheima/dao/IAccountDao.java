package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 * 账户的持久层接口
 */
public interface IAccountDao {

    List<Account> findAll();
    Account findAccountByID(int id);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccountByID(int id);

}
