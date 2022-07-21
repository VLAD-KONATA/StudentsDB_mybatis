package com.example.studentsdb_mybatis.mapper;

import com.example.studentsdb_mybatis.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    int addStudent(Student student);
    int deleteStudentByNo(Integer no);
    int updateStudentByNo(Student student);
    Student getStudentByNo(Integer no);
    List<Student> getAllStudents();
}

