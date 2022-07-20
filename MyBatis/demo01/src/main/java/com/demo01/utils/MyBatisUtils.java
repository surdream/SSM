package com.demo01.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory factory; // factory为单例
    private static final ThreadLocal<SqlSession> local = new ThreadLocal<>();

    static {
        try {
            InputStream is = Resources.getResourceAsStream("MyBatis-Config.xml");
            // "工厂建造者"
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            // 会话工厂
            factory = builder.build(is);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static SqlSessionFactory getFactory(){
//        return factory;
//    }

    /**
     * 获取sqlSession
     * @return sqlSession
     */
    public static SqlSession getSqlSession(boolean autoCommit){
        // 会话       sqlSession表示与数据库的链接，mybatis的操作对象
        SqlSession sqlSession = local.get();

        if (sqlSession ==null){
            // openSession()可以携带参数，表示是否开启自动提交事务
            sqlSession = factory.openSession(autoCommit);
            local.set(sqlSession);
        }
        return sqlSession;
    }

    // 手动提交
    public static SqlSession getSqlSession(){
        return getSqlSession(false);
    }

    /**
     * 获取dao
     * @param c 泛型对象
     * @param <T> 传递的Dao类型
     * @return 所需的dao
     */
    public static <T>T getMapper(Class<T> c){
        // 自动提交事务
        SqlSession sqlSession = getSqlSession(true);
        // getMapper可以得到任何接口的对象
        return sqlSession.getMapper(c);
    }
}
