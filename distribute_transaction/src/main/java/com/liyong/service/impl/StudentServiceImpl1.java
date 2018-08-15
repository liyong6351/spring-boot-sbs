package com.liyong.service.impl;

import com.liyong.mapper.multply.TStudentMapper1;
import com.liyong.mapper.single.TStudentMapper2;
import com.liyong.model.single.Student;
import com.liyong.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl1 implements StudentService {
    @Autowired
    TStudentMapper1 tStudentMapper1;

    @Autowired
    TStudentMapper2 tStudentMapper2;

    @Override
    public List<Student> findAll1Students() {
        return tStudentMapper1.selectStudent();
    }

    @Transactional(transactionManager = "test1DataSourceTransactionManager")
    @Override
    public Integer insert1(Integer id, String name) {
        int result = tStudentMapper1.insert(id, name);
        int a = 1 / 0;
        return result;
    }

    @Override
    public List<Student> findAll2Students() {
        return tStudentMapper2.selectStudent();
    }

    @Transactional(transactionManager = "test2DataSourceTransactionManager")
    @Override
    public Integer insert2(Integer id, String name) {
        int result = tStudentMapper2.insert(id, name);
        int a = 1 / 0;
        return result;
    }

    @Transactional(transactionManager = "test2DataSourceTransactionManager")
    @Override
    public Integer insert(Integer id, String name) {
        //传统分布式解决方案: jta+atomikos(不适合在微服务情况下解决)
        int i1 = tStudentMapper1.insert(id, name);
        int i2 = tStudentMapper2.insert(id, name);
        int a = 1 / 0;
        return i1 + i2;
    }
}
