package com.liyong.springboot.startway.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class_name: StudentController
 * package: com.liyong.springboot.startway.controller
 * describe: 这种方式是使用EnableAutoConfiguration启动springboot项目，同时可以和ComponentScan联合使用
 * create_user: liyong6351@gmail.com
 * create_date: 2018/8/3
 * create_time: 10:41
 **/
@EnableAutoConfiguration
@RestController
public class StudentController {

    @RequestMapping("/member/one")
    public String getMember() {
        return "getMember";
    }

    /*public static void main(String[] args) {
        SpringApplication.run(StudentController.class, args);
    }*/
}
