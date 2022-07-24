package com.AOP.test;

import com.AOP.dynamicProxy.CGLibDynamicProxy;
import com.AOP.beans.BookDaoImpl;

public class DynamicProxyTest {
    public static void main(String[] args) {
        // 被代理对象
        BookDaoImpl bookDao = new BookDaoImpl();
        //StudentDaoImpl studentDao = new StudentDaoImpl();

        // 创建动态代理对象，并将被代理对象传递到代理类中
        //JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy(studentDao);
        // 代理对象(强转为被代理对象实现的接口类型)
        //GeneralDao proxy = (GeneralDao) jdkDynamicProxy.getProxy();

        // 代理对象调用方法，不会执行调用的方法，而是先进入到创建代理对象时指定的InvocationHandler种类的invoke方法
        // 调用的方法会作为一个参数传递给invoke方法
        //proxy.delete();

        CGLibDynamicProxy cgLibDynamicProxy = new CGLibDynamicProxy(bookDao);
        BookDaoImpl proxy = (BookDaoImpl) cgLibDynamicProxy.getProxy();

        proxy.insert();

    }
}
