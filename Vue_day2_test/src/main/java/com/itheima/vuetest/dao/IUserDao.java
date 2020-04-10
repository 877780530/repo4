package com.itheima.vuetest.dao;

import com.itheima.vuetest.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface IUserDao {
    @Select("select * from user")
    public List<User> findAllUser();

    @Select("select * from user where id = #{id}")
    public User findUserById(int id);

    @Update("update user set username=#{username},password=#{password},sex=#{sex},age=#{age},email=#{email} where id=#{id}")
    public void updateUser(User user);
}
