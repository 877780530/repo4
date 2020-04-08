package com.itheima.service;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;

import java.util.List;

/**
 * 账户业务层接口
 */
public interface IAccountService {

    List<Account> findAll();
    Account findAccountByID(int id);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccountByID(int id);
}
