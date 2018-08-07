package com.liyong.springboot.startway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * class_name: StartWayApplication
 * package: com.liyong.springboot.startway
 * describe: 这种是通过SpringBootApplication注解方式启动的
 * create_user: liyong6351@gmail.com
 * create_date: 2018/8/3
 * create_time: 10:42
 **/
@SpringBootApplication
public class StartWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartWayApplication.class, args);
    }
}
