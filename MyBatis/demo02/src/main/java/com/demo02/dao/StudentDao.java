package com.demo02.dao;

import com.demo02.dto.Student;

import java.util.List;

public interface StudentDao {
    List<Student> listStudentsByCid(String cid);
    Student selectStudentBySid(String sid);
}
