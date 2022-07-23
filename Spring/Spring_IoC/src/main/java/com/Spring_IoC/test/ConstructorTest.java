package com.Spring_IoC.test;

import com.Spring_IoC.bean.Constructor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorTest {

    public static void main(String[] args) {
        // 通过Spring容器创建对象
        // 1.初始化Spring容器，加载Spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        // 通过Spring容器获取Student对象
        Constructor c1 = (Constructor) context.getBean("constructor");
        Constructor c2 = (Constructor) context.getBean("constructor");
//
        System.out.println(c1);
        System.out.println(c2);
//        System.out.println(c1.getHobbies().get(0));
    }
}
