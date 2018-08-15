package com.liyong.service;

import com.liyong.model.single.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll1Students();

    Integer insert1(Integer id, String name);

    List<Student> findAll2Students();

    Integer insert2(Integer id, String name);

    Integer insert(Integer id, String name);
}
