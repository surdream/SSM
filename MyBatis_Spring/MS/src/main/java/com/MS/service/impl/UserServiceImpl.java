package com.MS.service.impl;

import com.MS.bean.User;
import com.MS.dao.UserDao;
import com.MS.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl {

    @Resource
    private UserDao userDao;

    @Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.SUPPORTS)
    public List<User> listUsers() {
        return userDao.queryUsers();
    }

}
