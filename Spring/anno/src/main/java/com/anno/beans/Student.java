package com.anno.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Date;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@Scope(value = "singleton")
public class Student {
    private String stuNum = "1001";
    private String stuName = "name";
    private String stuGender = "nv";
    private int stuAge = 1;
    private Date enterTime = new Date();
    @Resource
    private Clazz clazz;

    public Student() {
        System.out.println("---无参构造器---");
    }

    @PostConstruct
    public void init(){
        System.out.println("---init---");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("---destroy---");
    }



}
