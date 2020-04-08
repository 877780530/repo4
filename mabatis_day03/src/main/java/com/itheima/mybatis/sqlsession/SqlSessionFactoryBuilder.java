package com.itheima.mybatis.sqlsession;

import com.itheima.mybatis.cfg.Configuration;
import com.itheima.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.itheima.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build(InputStream is){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(is);
        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(cfg);
        return sqlSessionFactory;
    }
}
