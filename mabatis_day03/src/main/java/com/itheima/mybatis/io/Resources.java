package com.itheima.mybatis.io;

import java.io.InputStream;

/**
 * 使用类加载器读取配置文件
 */
public class Resources {

    /**
     * 根据传输的文件路径得到字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
