package com.liyong.controller;

import com.liyong.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String test() {
        for (int i = 0; i < 1000000; i++) {
            String a = "string" + i;
        }
        return helloService.getHello();
    }
}
