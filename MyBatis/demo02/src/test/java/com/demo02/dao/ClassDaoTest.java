package com.demo02.dao;

import com.demo02.dto.Classes;
import com.demo02.utils.MyBatisUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassDaoTest {

    @Test
    void selectClassByCid() {
        ClassDao classDao = MyBatisUtils.getMapper(ClassDao.class);
        Classes classes = classDao.selectClassByCid(2);
        System.out.println(classes);
    }
}