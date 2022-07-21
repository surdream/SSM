package com.demo02.dao;

import com.demo02.dto.User;

public interface UserDao {
    int insertUser(User user);

    User selectUserByUserName(String username);

}
