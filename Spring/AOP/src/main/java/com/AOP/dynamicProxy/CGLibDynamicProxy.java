package com.AOP.dynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * 1.添加cglib依赖
 * 2.创建一个类，实现MethodInterceptor接口，同时实现intercept方法
 * 3.在类中创建一个Object类型的变量，并提供有参构造器
 * 4.定义getProxy，创建并返回代理对象
 */
public class CGLibDynamicProxy implements MethodInterceptor {
    private Object obj;

    public CGLibDynamicProxy(Object obj) {
        this.obj = obj;
    }

    public Object getProxy(){
        Enhancer enhancer = new Enhancer();
        // 传递父类
        enhancer.setSuperclass(obj.getClass());
        // 传递回调
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        begin();
        Object resultValue = method.invoke(obj,objects);
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
