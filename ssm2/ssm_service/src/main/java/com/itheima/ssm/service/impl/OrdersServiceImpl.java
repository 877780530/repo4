package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.IOrdersDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;


    @Override
    public List<Orders> findAllOrders(int page, int size) throws Exception {
        //会在查询语句后拼写分页条件，必须写在查询语句之前
        PageHelper.startPage(page,size);
        return ordersDao.findAllOrders();
    }

    @Override
    public Orders findOrdersById(String ordersId) throws Exception {
        return ordersDao.findOrderById(ordersId);
    }
}
