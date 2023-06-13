package com.zookeeper.service;

import com.zookeeper.domain.UserAddress;

import java.util.List;

/**
 * @Description:
 * @ClassName: OrderService
 * @Author: zxy
 * @Date: 2023/6/12 17:23
 */
public interface OrderService {


     List<UserAddress> initOrder(String Id);
}
