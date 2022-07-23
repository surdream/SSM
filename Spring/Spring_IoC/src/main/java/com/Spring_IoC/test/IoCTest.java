package com.Spring_IoC.test;

import com.Spring_IoC.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class IoCTest {
    public static void main(String[] args) {
        // 通过Spring容器创建对象
        // 1.初始化Spring容器，加载Spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        // 通过Spring容器获取Student对象
        Student student2 = (Student) context.getBean("student");

        System.out.println(student2);
        System.out.println(student2.getHobbies().get(0));
    }

}
