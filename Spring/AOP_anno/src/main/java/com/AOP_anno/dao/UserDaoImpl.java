package com.AOP_anno.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl {

    public void insert(){
        System.out.println("------  insert  -------");
    }
}
