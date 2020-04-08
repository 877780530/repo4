package cn.itcast.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello2")
public class Test2Controller {

    @RequestMapping("boot")
    public String helloSpringboot(){
        return "hello Springboot2";
    }

}
