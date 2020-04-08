package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 根据用户ID删除用户
     * @param uid
     */
    void deleteUserById(int uid);

    /**
     * 更新用户
     */
    void updateUser(User user);

    User findUserById(int id);

    List<User> findUsersByName(String username);

    int findTotalCount();
}
