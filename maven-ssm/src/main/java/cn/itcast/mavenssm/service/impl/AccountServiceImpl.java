package cn.itcast.mavenssm.service.impl;

import cn.itcast.mavenssm.dao.AccountDao;
import cn.itcast.mavenssm.domain.Account;
import cn.itcast.mavenssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findById(int id) {
        return accountDao.findById(id);
    }
}
