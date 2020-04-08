package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();

    void addUser(User user);

    void deleteUserById(int uid);

    void updateUser(User user);

    User findUserById(int id);

    List<User> findUsersByName(String username);
}
