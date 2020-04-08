package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.impl.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountServiceTest {
    public AccountServiceImpl as;
    public ApplicationContext ac;

    @Test
    public void test_findAll(){
        List<Account> accounts = as.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void test_findAccountByID(){
        System.out.println(as.findAccountByID(1));
    }

    @Test
    public void test_saveAccount(){
        Account account = new Account();
        account.setName("韩帆");
        account.setMoney(12345f);
        as.saveAccount(account);
        System.out.println(as.findAccountByID(4));
    }

    @Test
    public void test_updateAccount(){
        Account account = new Account();
        account.setId(4);
        account.setName("韩彬");
        account.setMoney(12345f);
        as.updateAccount(account);
        System.out.println(as.findAccountByID(4));
    }

    @Test
    public void test_deleteAccount(){
        as.deleteAccountByID(4);
        System.out.println(as.findAccountByID(4));
    }

    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("bean.xml");
        as = ac.getBean("accountService", AccountServiceImpl.class);
    }
}
