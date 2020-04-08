package com.itheima.ssm.service;

import com.itheima.ssm.domain.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAllRole() throws Exception;

    void saveRole(Role role) throws Exception;
}
