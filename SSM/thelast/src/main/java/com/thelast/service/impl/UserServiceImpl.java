package com.thelast.service.impl;

import com.thelast.beans.User;
import com.thelast.dao.UserDao;
import com.thelast.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Transactional
    public User checkLogin(String userName, String userPwd) {
        User user = userDao.selectUserByName(userName);
        if (user != null && user.getUserPwd().equals(userPwd)){
            return user;
        }
        return null;
    }
}
