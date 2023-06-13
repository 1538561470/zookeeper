package com.zxy.zookeeper.service.impl;


import com.zookeeper.domain.UserAddress;
import com.zookeeper.service.OrderService;
import com.zookeeper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description:
 * @ClassName: OrderServiceImpl
 * @Author: zxy
 * @Date: 2023/6/12 17:07
 */
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userServe;

    @Override
    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userServe.getUserAddressList(userId);
        return addressList;
    }
}
