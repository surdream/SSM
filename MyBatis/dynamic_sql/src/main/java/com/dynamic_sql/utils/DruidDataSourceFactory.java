package com.dynamic_sql.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;


public class DruidDataSourceFactory extends PooledDataSourceFactory {

    // 这里是继承的属性，可以不写
    // protected DataSource dataSource =  new UnpooledDataSource();

    public DruidDataSourceFactory() {
        // 覆盖掉MyBatis的数据源
        this.dataSource = new DruidDataSource();
    }

    // 继承了返回方法，直接忽略不写
    //@Override
    //public DataSource getDataSource() {
    //    return super.getDataSource();
    //}
}
