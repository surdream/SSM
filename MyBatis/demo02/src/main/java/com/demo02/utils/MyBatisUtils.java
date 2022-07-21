package com.demo02.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory factory;
    private static final ThreadLocal<SqlSession> local = new ThreadLocal<>();


    static {
        try {
            InputStream is = Resources.getResourceAsStream("MyBatis-Config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(is);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读取文件出错了");
        }
    }

    public static SqlSessionFactory getFactory() {
        return factory;
    }

    public static SqlSession getSqlSession(boolean autoCommit){
        SqlSession sqlSession = local.get();
        if (sqlSession ==null){
            sqlSession = factory.openSession(autoCommit);
            local.set(sqlSession);
        }
        return sqlSession;
    }

    public static SqlSession getSqlSession(){
        return getSqlSession(false);
    }


    public static <T>T getMapper(Class<T> c){
        SqlSession sqlSession = getSqlSession(true);
        return sqlSession.getMapper(c);
    }
}
