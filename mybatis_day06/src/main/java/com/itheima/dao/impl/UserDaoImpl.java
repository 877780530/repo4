package com.itheima.dao.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    SqlSessionFactory factory;
    SqlSession session;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
        this.session = factory.openSession();
    }

    @Override
    public List<User> findAll() {

        List<User> users = session.selectList("com.itheima.dao.IUserDao.findAll");
        session.commit();
        session.close();
        return users;
    }

    @Override
    public void addUser(User user) {
        session.insert("com.itheima.dao.IUserDao.addUser");
        session.commit();
        session.close();
    }

    @Override
    public void deleteUserById(int uid) {
        session.delete("com.itheima.dao.IUserDao.deleteUserById",uid);
        session.commit();
        session.close();
    }

    @Override
    public void updateUser(User user) {
        session.update("com.itheima.dao.IUserDao.updateUser",user);
        session.commit();
        session.close();
    }

    @Override
    public User findUserById(int id) {
        User user = session.selectOne("com.itheima.dao.IUserDao.findUserById", id);
        session.commit();
        session.close();
        return user;
    }

    @Override
    public List<User> findUsersByName(String username) {
        List<User> users = session.selectList("com.itheima.dao.IUserDao.findUsersByName", username);
        session.commit();
        session.close();
        return users;
    }
}
