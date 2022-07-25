package com.AOP_anno.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionManager {

    // 定义切入点
    @Pointcut("execution(* com.AOP_anno.dao.*.*(..))")
    public void pc1(){};

    @Before("pc1()")
    public void begin(){
        System.out.println("==== 开启事务 ====");
    }

    @After("pc1()")
    public void commit(){
        System.out.println("==== 提交事务 ====");
    }

    @Around("pc1()")
    public Object printExecuteTime(ProceedingJoinPoint point) throws Throwable {
        long time1 = System.currentTimeMillis();
        System.out.println(time1);
        Object v = point.proceed();
        long time2 = System.currentTimeMillis();
        System.out.println(time2);
        return v;
    }
}
