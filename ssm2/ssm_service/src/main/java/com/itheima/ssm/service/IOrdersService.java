package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IOrdersService {
    @Select("select * from orders")
    public List<Orders> findAllOrders(int page, int size) throws Exception;

    Orders findOrdersById(String ordersId) throws Exception;
}
