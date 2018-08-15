package com.liyong.service.impl;

import com.liyong.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello() {
        return "hello world";
    }
}
