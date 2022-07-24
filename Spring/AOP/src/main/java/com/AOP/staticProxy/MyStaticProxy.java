package com.AOP.staticProxy;

public class MyStaticProxy {

//    private BookDaoImpl dao = new BookDaoImpl();
//    private StudentDaoImpl dao = new StudentDaoImpl();
    private GeneralDao dao ;


    /**
     * 必须要有一个构造器
     * @param GeneralDao
     */
    public MyStaticProxy(GeneralDao GeneralDao) {
        this.dao = GeneralDao;
    }

    public void insert(){
        begin();
        dao.insert();
        end();
    }

    public void delete(){
        begin();
        dao.delete();
        end();
    }

    public void update(){
        begin();
        dao.update();
        end();
    }

    long time1,time2;
    public void begin(){
        time1 = System.currentTimeMillis();
        System.out.println("=== 开启事务 ===");
    }
    public void end(){
        System.out.println("=== 提交事务 ===");
        time2 = System.currentTimeMillis();
        System.out.println(dao.getClass() + "执行时间为：" + (time2-time1));
    }

}
