package com.liyong.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * class_name: FtlIndexController
 * package: com.liyong.freemarker.controller
 * describe: 整合framework
 * create_user: liyong6351@gmail.com
 * create_date: 2018/8/3
 * create_time: 10:48
 **/
@Controller
public class FtlIndexController {

    @RequestMapping("ftlIndex")
    public String ftlIndex(Map<String, Object> map) {
        map.put("name", "李勇we");
        map.put("age", "33");
        map.put("sex", "0");
        return "ftlIndex";
    }
}
