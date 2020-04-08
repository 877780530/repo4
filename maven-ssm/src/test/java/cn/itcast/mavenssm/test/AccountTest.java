package cn.itcast.mavenssm.test;

import cn.itcast.mavenssm.dao.AccountDao;
import cn.itcast.mavenssm.domain.Account;
import cn.itcast.mavenssm.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountTest {

    @Test
    public void test_findAll(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = ac.getBean(AccountService.class);

        List<Account> accounts = accountService.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void test_findById(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = ac.getBean("accountDao", AccountDao.class);
        Account account = accountDao.findById(1);
        System.out.println(account);

    }
}
