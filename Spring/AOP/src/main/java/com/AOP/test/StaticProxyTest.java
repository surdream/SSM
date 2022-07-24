package com.AOP.test;

import com.AOP.beans.BookDaoImpl;
import com.AOP.staticProxy.MyStaticProxy;
import com.AOP.beans.StudentDaoImpl;

public class StaticProxyTest {

    /**
     * 这里就相当于是Spring容器，直接指定需要修改的实现类
     * @param args
     */
    public static void main(String[] args) {

        // 被代理对象
        BookDaoImpl bookDao = new BookDaoImpl();
        StudentDaoImpl studentDao = new StudentDaoImpl();
//        MyStaticProxy proxy = new MyStaticProxy();

        // 为被代理对象创建代理对象
        MyStaticProxy proxy = new MyStaticProxy(studentDao);
        proxy.insert();
    }
}
