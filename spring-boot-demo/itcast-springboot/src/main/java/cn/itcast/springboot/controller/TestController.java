package cn.itcast.springboot.controller;

import cn.itcast.springboot.config.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("hello1")
public class TestController {
    @Autowired
    private DataSource dataSource;
/*    @Autowired
    private JdbcProperties jdbcProperties;*/

    @RequestMapping("boot")
    public String helloSpringboot(){
        return "hello Springboot1";
    }

}
