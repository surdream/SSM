package com.demo01.dao;

import com.demo01.dto.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    // mybatis中进行条件查询操作：
    // 1、操作方法只有一个参数：
    //  a.（简单类型、字符串类型）可以在mapper中通过#{}给任意字符串直接获取
    //  b. (简单对象类型) 则要在mapper中通过 #{属性名} 来获取
    //  c. (Map类型) 则要在mapper中通过 #{Key} 指定属性名来获取

    // 2.操作方法存在多个参数：
    //  a. 使用arg0,...来取（开始下标为0）
    //  b. 使用param1,...来取（开始下标为1）
    //  c. 使用@Param("属性名"),在mapper中使用 #{属性名} 来获取

    public int insertStudent(Student student);
    public int deleteStudent(int stuNum);
    public int updateStudent(Student student);
    public List<Student> listStudents();
    public Student selectStudent(int stuNum);
    public List<Student> listStudentsByPage(@Param("start") int start,@Param("pageSize") int pageSize);
    public int getCount();


}
