package com.thelast.dao;

import com.thelast.beans.User;

import java.util.List;

public interface UserDao {
    int insertUser(User user);
    int deleteUser(int userId);
    int updateUser(User user);
    User selectUserByName(String userName);
    List<User> selectAllUsers();
}
