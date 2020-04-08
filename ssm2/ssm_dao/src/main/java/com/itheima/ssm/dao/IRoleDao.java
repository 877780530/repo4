package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IRoleDao {
    @Select("select * from role where id in (select roleId from users_role where userId = #{userId})")
    public List<Role> findRoleByUserId(String userId) throws Exception;

    @Select("select * from role")
    List<Role> findAllRole() throws Exception;

    @Insert("insert into role (roleName,roleDesc) values(#{roleName},#{roleDesc})")
    void saveRole(Role role) throws Exception;
}