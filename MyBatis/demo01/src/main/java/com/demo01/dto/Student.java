package com.demo01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * 使用lombok创建实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int stuNum;
    private String stuName;
    private String stuGender;
    private int stuAge;

}
