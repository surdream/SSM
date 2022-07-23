package com.Spring_IoC.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DIPrinciple {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        String classPath = "com.Spring_IoC.bean.Student";

        Class<?> c = Class.forName(classPath);

        // 通过反射创建对象
        Object obj = c.newInstance();
        System.out.println(obj);

        // 通过反射获取属性
        Field[] fields = c.getDeclaredFields();
        for (Field f:fields) {

            String fieldName = f.getName();
            String setMethName = "set"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
            if ("stuNum".equals(fieldName)){
                Method setMethod = c.getDeclaredMethod(setMethName, f.getType());// set方法 属性类型
                setMethod.invoke(obj,"10001");
            }
            System.out.println(fieldName + "~~~~~~~~~~~" +setMethName);

        }
    }
}
