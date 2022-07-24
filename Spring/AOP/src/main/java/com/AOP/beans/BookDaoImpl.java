package com.AOP.beans;

public class BookDaoImpl {

    public void insert(){
        System.out.println("--- insert book ---");
    }
    public void delete(){
        System.out.println("--- delete book ---");
    }
    public void update(){
        System.out.println("--- update book ---");
    }
}
