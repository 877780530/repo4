package cn.itcast.mavenssm.controller;

import cn.itcast.mavenssm.domain.Account;
import cn.itcast.mavenssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("test")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("account")
    public String testAccount(Model model){
        List<Account> accounts = accountService.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        model.addAttribute("accounts",accounts);
        return "success";
    }
}
