package com.thelast.service;

import com.thelast.beans.User;

public interface UserService {
    public User checkLogin(String userName,String userPwd);
}
