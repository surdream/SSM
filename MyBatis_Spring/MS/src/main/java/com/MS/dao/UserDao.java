package com.MS.dao;

import com.MS.bean.User;

import java.util.List;

public interface UserDao {
    List<User> queryUsers();
    int insertUser(User user);
}
