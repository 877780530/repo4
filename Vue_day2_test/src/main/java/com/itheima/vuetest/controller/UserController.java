package com.itheima.vuetest.controller;

import com.itheima.vuetest.domain.User;
import com.itheima.vuetest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("/findAll.do")
    public  List<User> findAllUser(){
        List<User> users = userService.findAllUser();
        System.out.println("请求到我了");
        return users;
    }

    @RequestMapping("/findById.do")
    public User findUserById(int id){
        User user = userService.findUserById(id);
        return user;
    }

    @RequestMapping("/updateUser.do")
    public void updateUser(User user){
        userService.updateUser(user);
    }
}
