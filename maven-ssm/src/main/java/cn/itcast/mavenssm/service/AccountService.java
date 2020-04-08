package cn.itcast.mavenssm.service;

import cn.itcast.mavenssm.dao.AccountDao;
import cn.itcast.mavenssm.domain.Account;

import java.util.List;

/**
 * 用户业务层接口
 */
public interface AccountService {
    public List<Account> findAll();

    public Account findById(int id);


}
