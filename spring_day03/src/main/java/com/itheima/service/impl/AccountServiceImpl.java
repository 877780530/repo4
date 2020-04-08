package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;

import java.util.List;


public class AccountServiceImpl implements IAccountService {
    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    private IAccountDao accountDao;

    @Override
    public void transferMoney(int sourceID, int targetID, float transferMoney) {

            Account sourceAccount = accountDao.findByID(sourceID);
            Account targetAccount = accountDao.findByID(targetID);
            sourceAccount.setMoney(sourceAccount.getMoney()-transferMoney);
            targetAccount.setMoney(targetAccount.getMoney()+transferMoney);
            accountDao.updateAccount(sourceAccount);
            /*int i =  1/0;*/
            accountDao.updateAccount(targetAccount);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
