package com.itheima.test;

import com.itheima.vuetest.domain.User;
import com.itheima.vuetest.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserTest {
    @Autowired
    IUserService userService;

    @Test
    public void test_findAllUser(){
        List<User> users = userService.findAllUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test_findUserById(){
        User user = userService.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void test_updateUser(){
        User user = userService.findUserById(1);
        System.out.println("更新前的用户"+user);

        user.setAge(25);
        userService.updateUser(user);

        User user1 = userService.findUserById(1);
        System.out.println("更新后的用户" + user1);
    }
}
