package com.demo02.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String stuId;
    private String stuName;
    private int stuAge;

}


//    private List<Course> courses;
//    private int stuCid;   //一对多时需要
//    private Classes classes;  //多对一时需要
