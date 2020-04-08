package com.itheima.dao.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUserById(int uid) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public User findUserById(int id) {
        return null;
    }

    @Override
    public List<User> findUsersByName(String username) {
        return null;
    }

    @Override
    public int findTotalCount() {
        return 0;
    }
}
