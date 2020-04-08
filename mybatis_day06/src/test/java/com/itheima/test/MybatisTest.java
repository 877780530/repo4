package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {

    private InputStream is;
    private SqlSessionFactory factory;
    private IUserDao userDao;
    /**
     * 初始化
     * @throws IOException
     */
    @Before
    public void init() throws IOException {
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(is);
        userDao = new UserDaoImpl(factory);
    }

    @After
    public void destroy() throws IOException {
        if (is!=null){
            is.close();
        }
    }

    @Test
    public void test_findAll(){
        List<User> users = userDao.findAll();
        for (User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void test_addUser(){
        User user = new User();
        user.setUsername("韩帆");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("福建");
        userDao.addUser(user);
    }

    @Test
    public void test_deleteUserById(){
        int uid = 50;
        userDao.deleteUserById(uid);
    }

    @Test
    public void test_updateUser(){
        User user = new User();
        user.setId(51);
        user.setUsername("韩彬");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("福建");
        userDao.updateUser(user);
    }

    @Test
    public void test_findUserById(){
        User user = userDao.findUserById(52);
        System.out.println(user);
    }

    @Test
    public void test_findUsersByName(){
        List<User> users = userDao.findUsersByName("%王%");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
