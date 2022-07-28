package com.thelast.service.impl;

import com.thelast.beans.User;
import com.thelast.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml","classpath:spring-IoC.xml","classpath:spring-servlet.xml"})
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void checkLogin() {
        User user = userService.checkLogin("surdream", "123456");
        System.out.println(user);
        assertNotNull(user);
    }
}