package com.AOP.dynamicProxy;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * JDK动态代理：
 * 是通过被代理对象实现的接口产生代理对象
 * 1.创建代理对象（实现拦截器 InvocationHandler，重写invoke方法）
 * 2.定义一个Object变量，提供有参构造器（用于接收被代理对象）
 * 3.定义getProxy(),通过反射获取被代理对象的类加载器和实现接口,并返回被代理对象（副本）
 */
//@AllArgsConstructor
public class JDKDynamicProxy implements InvocationHandler {
    // 定义被代理对象
    private Object obj;

    public JDKDynamicProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * 产生代理对象
     * @return 代理对象
     */
    public Object getProxy(){
        // 1.获取被代理对象的类加载器
        ClassLoader classLoader = obj.getClass().getClassLoader();

        // 2.获取被代理对象的类实现的接口
        Class<?>[] interfaces = obj.getClass().getInterfaces();

        // 3.产生代理对象(传递被代理对象、被代理对象实现的接口)
        // 第一个参数：被代理对象的类加载器
        // 第二个参数：被代理类实现的接口
        // 第三个参数：使用产生代理对象调用方法时，用于拦截方法执行的处理器
        Object o = Proxy.newProxyInstance(classLoader, interfaces,this);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        begin();
//        System.out.println("------hello--------");
        Object resultValue = method.invoke(obj,args);
        commit();

        return resultValue;

    }

    public void begin(){
        System.out.println("=== 开启事务 ===");
    }
    public void commit(){
        System.out.println("=== 关闭事务 ===");
    }

}
