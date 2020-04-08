package com.itheima.ssm;

import com.itheima.ssm.dao.IProductDao;
import com.itheima.ssm.domain.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProductDaoTest {


    @Test
    public void test_findAllProduct(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IProductDao productDao = ac.getBean(IProductDao.class);
        List<Product> products = productDao.findAllProduct();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
