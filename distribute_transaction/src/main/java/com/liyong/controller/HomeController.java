package com.liyong.controller;

import com.liyong.model.po.Student;
import com.liyong.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public List hello(Integer type) {
        type = type == null ? 0 : type;
        if (1 == type) {
            return studentService.findAll1Students();
        } else {
            return studentService.findAll2Students();
        }
    }

    @RequestMapping("/insert")
    public Integer hello(Student student) {
        if (1 == student.getType()) {
            return studentService.insert1(student.getId(), student.getName());
        } else {
            return studentService.insert2(student.getId(), student.getName());
        }
    }

    @RequestMapping("/all")
    public Integer all(Student student) {
        return studentService.insert(student.getId(), student.getName());
    }
}
