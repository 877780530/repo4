package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    public IAccountDao accountDao = null;

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findAccountByID(int id) {
        return accountDao.findAccountByID(id);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccountByID(int id) {
        accountDao.deleteAccountByID(id);
    }
}
