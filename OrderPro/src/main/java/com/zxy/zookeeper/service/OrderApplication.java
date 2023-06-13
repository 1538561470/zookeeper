package com.zxy.zookeeper.service;

import com.zookeeper.domain.UserAddress;
import com.zookeeper.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * @Description:
 * @ClassName: OrderApplication
 * @Author: zxy
 * @Date: 2023/6/13 14:41
 */
public class OrderApplication {


    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("consumer.xml");
        UserService bean = applicationContext.getBean(UserService.class);
        //List<UserAddress> userList = bean.getUserList("1");
        //System.out.println("userList size: "+userList);
        //System.in.read();
    }
}
