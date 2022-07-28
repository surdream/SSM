package com.thelast.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml","classpath:spring-IoC.xml","classpath:spring-servlet.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void selectUserByName() {

        System.out.println(userDao);
        System.out.println(userDao.selectUserByName("surdream"));

    }
}