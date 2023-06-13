package com.zxy.zoo.controller;

import com.zookeeper.domain.UserAddress;
import com.zookeeper.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @ClassName: OrderController
 * @Author: zxy
 * @Date: 2023/6/13 16:47
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/order")
    @ResponseBody
    public List<UserAddress> orderTest(@RequestParam("id") String id){
        List<UserAddress> userAddresses = orderService.initOrder(id);
        return userAddresses;
    }
}
