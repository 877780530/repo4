package cn.itcast.mavenssm.dao;

import cn.itcast.mavenssm.domain.Account;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface AccountDao {

    public List<Account> findAll();

    public Account findById(int id);

}
