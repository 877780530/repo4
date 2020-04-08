package com.itheima.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtil {
    private ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private DataSource dataSource;

    public Connection getThreadConnection() {
        try{
            Connection conn = threadLocal.get();
            if (conn==null){
                conn = dataSource.getConnection();
                threadLocal.set(conn);
            }
            return conn;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void removeConnection(){
        threadLocal.remove();
    }
}
