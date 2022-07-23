package com.Spring_IoC.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@ToString
public class Constructor {
    private int ci;
    private double cd;
    private String cs;
    private Date date;
    private Clazz clazz;

    public void init(){
        // 初始化方法，创建对象的时候调用
        System.out.println("------init-----");
        this.cd = 10.0;
        this.cs = "";
    }
    public void destroy(){
        // 销毁方法,在spring容器销毁对象时执行
        System.out.println("------destroy-----");
    }

    public Constructor() {
        System.out.println("---调用了无参构造器---");
    }
}
