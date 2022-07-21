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
public class Classes {
    private int classId;
    private String className;
    private String classDesc;

//    private List<Student> stus;
}
