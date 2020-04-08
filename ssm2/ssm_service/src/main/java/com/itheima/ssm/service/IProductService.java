package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAllProduct() throws Exception;

    void saveProduct(Product product) throws Exception;
}
