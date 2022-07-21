package com.demo01.dao;

import com.demo01.dto.Student;
import com.demo01.utils.MyBatisUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentDaoTest {

    @Test // 添加（手动提交）
    void insertStudent() {
        int i = 0;
        SqlSession sqlSession = MyBatisUtils.getSqlSession(false);
        try{
            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
            Student student = new Student(0, "刘宗哲", "男", 19);

            i = studentDao.insertStudent(student);

            //如果mapper中设置了useGeneratedKeys，那就可以获取回填结果stu_num了（自动增长）
            System.out.println(student);

            // 手动提交
            sqlSession.commit();

        }catch (Exception e){
            System.err.println(e.getMessage());
            sqlSession.rollback();
        }

        assertEquals(1,i);

    }

    @Test // 删除
    void deleteStudent() {
        StudentDao studentDao = MyBatisUtils.getMapper(StudentDao.class);
        int i = studentDao.deleteStudent(20201309);

        assertEquals(1,i);
    }

    @Test // 修改
    void updateStudent() {
        StudentDao studentDao = MyBatisUtils.getMapper(StudentDao.class);
        int i = studentDao.updateStudent(new Student(20201309, "袁离", "女", 19));

        assertEquals(1,i);

    }


    @Test // 查询全部
    void listStudents() {

        StudentDao studentDao = MyBatisUtils.getMapper(StudentDao.class);
        List<Student> students = studentDao.listStudents();

        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test // 查询一个
    void selectStudent() {

        StudentDao studentDao = MyBatisUtils.getMapper(StudentDao.class);
        Student student  = studentDao.selectStudent(20201314);

        System.out.println(student);

    }

//    @Test // 分页查询
//    void listStudentsByPage() {
//
//        StudentDao studentDao = MyBatisUtils.getMapper(StudentDao.class);
//        List<Student> students  = studentDao.listStudentsByPage(0,5);
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//    }
//
//    @Test // 获取总数
//    void getCount() {
//        StudentDao studentDao = MyBatisUtils.getMapper(StudentDao.class);
//        int count = studentDao.getCount();
//
//        System.out.println(count);
//    }

    @Test // 使用pageHelper的分页查询
    void listStudentsByPage() {

        // 一定要在查询之前设置（mybatis会查询拦截器，然后在查询时设置参数）
        PageHelper.startPage(2,5);

        StudentDao studentDao = MyBatisUtils.getMapper(StudentDao.class);
        List<Student> students = studentDao.listStudents();
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        List<Student> list = pageInfo.getList();

        for (Student stu:list){
            System.out.println(stu);
        }

    }

}