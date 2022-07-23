package com.Spring_IoC.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.lang.reflect.Array;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String stuNum;
    private String stuName;
    private String stuGender;
    private int stuAge;
    private double stuWeight;
    private Date enterTime;
    private Clazz clazz;
    private List<Book> hobbies;
    private Set<String> sets;
    private Map<String,Object> maps;
    private Properties properties;


    public Student(String stuGender) {
        this.stuGender = stuGender;
    }


}
