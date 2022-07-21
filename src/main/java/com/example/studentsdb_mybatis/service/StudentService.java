package com.example.studentsdb_mybatis.service;

import com.example.studentsdb_mybatis.mapper.StudentMapper;
import com.example.studentsdb_mybatis.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;
    public int addStudent(Student student) {return studentMapper.addStudent(student);}
    public int updateStudent(Student student) {
        return studentMapper.updateStudentByNo(student);
    }
    public int deleteStudentByNo(Integer no) {
        return studentMapper.deleteStudentByNo(no);
    }
    public Student getStudentByNo(Integer no) {
        return studentMapper.getStudentByNo(no);
    }
    public List<Student> getAllStudents() {
        return studentMapper.getAllStudents();
    }
}

