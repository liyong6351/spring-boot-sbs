package com.liyong.springboot.adminuiservice.controller;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

public class AdminUIServer {
    public static void main(String[] args) {
        SpringApplication.run(AdminUIServer.class, args);
    }
}
