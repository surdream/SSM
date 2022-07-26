package com.MS.dao;

import com.MS.bean.User;
import com.MS.service.UserService;
import com.MS.service.impl.UserServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void queryUsers() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");

        List<User> users = userService.listUsers();

        for (User user :users) {
            System.out.println(user);
        }

    }

    @Test
    void insertUser() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");

        User user = new User(0, "空", "123456", "属性空", "images/004.png");

        int i = userDao.insertUser(user);

        assertEquals(1,i);

    }
}