package com.anno.test;

import com.anno.beans.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        // 初始化Spring工厂
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");

        System.out.println("------------------------");
        // 通过Spring工厂获取Student对象
        Student stu1 = (Student) context.getBean("student");
        Student stu2 = (Student) context.getBean("student");
        System.out.println(stu1);
        System.out.println(stu1 == stu2);
    }
}
