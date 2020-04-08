package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 入门案例
 */
public class MybatisTest {
    public static void main(String[] args) throws Exception {
        //读取配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建sqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        //用sqlSessionFactory工厂创建sqlSession对象
        SqlSession sqlSession = factory.openSession();
        //使用sqlSession创建代理对象
        IUserDao dao = sqlSession.getMapper(IUserDao.class);
        //使用代理对象执行方法
        List<User> users = dao.findAll();
        for (User user:users) {
            System.out.println(user);
        }
        //释放资源
        sqlSession.close();
        is.close();
    }
}
