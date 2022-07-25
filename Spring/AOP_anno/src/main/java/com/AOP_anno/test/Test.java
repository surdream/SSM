package com.AOP_anno.test;

import com.AOP_anno.dao.UserDaoImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        UserDaoImpl userDaoImpl = (UserDaoImpl) context.getBean("userDaoImpl");

        userDaoImpl.insert();
    }
}
