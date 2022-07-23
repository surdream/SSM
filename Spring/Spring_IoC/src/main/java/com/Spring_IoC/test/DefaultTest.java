package com.Spring_IoC.test;

import com.Spring_IoC.bean.Student;

import java.util.Date;

public class DefaultTest {

    public static void main(String[] args) {
        // 创建一个学生对象
        Student student1 = new Student();
        // 给学生属性赋值
        student1.setStuNum("10001");
        student1.setStuName("张三");
        student1.setStuAge(20);
        student1.setStuGender("男");
//        student1.setEnterTime(new Date());


        System.out.println(student1);
    }
}
