package com.AOP.beans;

import com.AOP.staticProxy.GeneralDao;

public class StudentDaoImpl{

    public void insert(){
        System.out.println("--- insert Student ---");
    }

    public void delete(int num){
        System.out.println("--- delete Student ---");
    }

    public void update(){
        System.out.println("--- update Student ---");
    }
}
