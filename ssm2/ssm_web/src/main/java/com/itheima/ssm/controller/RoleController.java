package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Role;
import com.itheima.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    IRoleService roleService;
    @RequestMapping("/findAllRole.do")
    public ModelAndView findAllRole() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Role> roles = roleService.findAllRole();
        mv.addObject("roleList",roles);
        mv.setViewName("role-list");
        return mv;
    }
    @RequestMapping("/saveRole.do")
    public String saveRole(Role role) throws Exception {
        roleService.saveRole(role);
        return "redirect:findAllRole.do";
    }
}
