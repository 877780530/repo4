package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.mybatis.annotations.Select;

import java.util.List;

/**
 * 用户实体类接口
 */
public interface IUserDao {

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
