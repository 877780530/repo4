package com.itheima.vuetest.service;

/**
 * 用户业务层接口
 */

import com.itheima.vuetest.domain.User;

import java.util.List;

public interface IUserService {
    public List<User> findAllUser();

    public User findUserById(int id);

    public void updateUser(User user);
}
