package com.liyong.mapper.single;

import com.liyong.model.single.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TStudentMapper2 {
    @Select({"select id ,name from t_student"})
    List<Student> selectStudent();

    @Insert({"insert into t_student(id,name) values(#{id},#{name})"})
    Integer insert(@Param("id") Integer id, @Param("name") String name);
}