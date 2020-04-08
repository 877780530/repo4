package com.itheima.mybatis.sqlsession;

/**
 * 用户和数据库交互的核心类
 */
public interface SqlSession {
    /**
     * 根据参数创建代理对象
     * @param daoInterfaceClass
     * @param <T>
     * @return
     */
    <T> T  getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
