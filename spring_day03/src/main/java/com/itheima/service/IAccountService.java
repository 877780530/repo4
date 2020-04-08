package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

/**
 * 用户业务层接口
 */
public interface IAccountService {

    public void transferMoney(int sourceID,int targetID,float transferMoney);

    public List<Account> findAll();
}
