package com.liyong.service.impl;

import com.liyong.mapper.multply.TStudentMapper1;
import com.liyong.model.single.Student;
import com.liyong.service.StudentService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService1 {
    @Autowired
    TStudentMapper1 tStudentMapper1;

    @Override
    public List<Student> findAllStudents() {
        return tStudentMapper1.selectStudent();
    }
}
