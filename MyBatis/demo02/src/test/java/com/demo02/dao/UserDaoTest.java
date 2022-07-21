package com.demo02.dao;

import com.demo02.dto.User;
import com.demo02.dto.Detail;
import com.demo02.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void insertUser() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        User user = new User(0, "wangwu", "123456", "王五", "images/003.png",null);
        Detail detail = new Detail(0,"广东佛山","13734674748","爱唱歌",0);

        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            userDao.insertUser(user);
            System.out.println(user);

            // 使用添加用户后产生的user_id传递给用户信息表
            detail.setUid(user.getUserId());
            DetailDao detailDao = sqlSession.getMapper(DetailDao.class);
            detailDao.insertDetail(detail);

            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }
    }

    @Test
    void selectUserByUserName() {
        UserDao userDao = MyBatisUtils.getMapper(UserDao.class);
        User user = userDao.selectUserByUserName("surdream");
        System.out.println(user);

    }
}