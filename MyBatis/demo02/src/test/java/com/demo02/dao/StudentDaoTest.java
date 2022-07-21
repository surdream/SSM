package com.demo02.dao;

import com.demo02.dto.Student;
import com.demo02.utils.MyBatisUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDaoTest {

    @Test
    void selectStudentBySid() {
        StudentDao studentDao = MyBatisUtils.getMapper(StudentDao.class);
        Student student = studentDao.selectStudentBySid("10001");
        System.out.println(student);
    }
}