package com.AOP.utils;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void method1(){
        System.out.println("~~~~~before~~~~~");
    }
    public void method2(){
        System.out.println("~~~~~after~~~~~");
    }
    public void method3(){
        System.out.println("~~~~~after-throwing~~~~~");
    }
    public void method4(){
        System.out.println("~~~~~after-returning~~~~~");
    }

    //1.必须带有参数
    //2.必须有object的返回类型
    //2.在前后业务逻辑之间执行Object v = point.proceed();
    public Object method5(ProceedingJoinPoint point) throws Throwable {
//        System.out.println("~~~~~around~~~~~");
        System.out.println("1");
        //此句表示切入点方法的执行
        Object v = point.proceed();
        System.out.println("2");
        return v;
    }
}
