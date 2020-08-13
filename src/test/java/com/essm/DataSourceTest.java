package com.essm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 数据源切换测试
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-08-06
 */
@SpringBootTest
public class DataSourceTest {

    @Autowired
    DataSource dataSource;

    @Test
    void contexts() throws SQLException {
        //测试springboot启动器druid——start启动配置，纯yml配置数据源
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        //class com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceWrapper
        //com.alibaba.druid.proxy.jdbc.ConnectionProxyImpl@54ccb3
        connection.close();
    }

    @Test
    void contexts2() throws SQLException {
        //测试，使用普通的阿里巴巴druid依赖数据源
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        //class com.alibaba.druid.pool.DruidDataSource
        //com.alibaba.druid.proxy.jdbc.ConnectionProxyImpl@1b5f960a
        connection.close();
    }
}
