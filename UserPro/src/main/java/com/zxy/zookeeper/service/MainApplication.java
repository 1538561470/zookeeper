package com.zxy.zookeeper.service;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;


/**
 * @Description:
 * @ClassName: MainApplication
 * @Author: zxy
 * @Date: 2023/6/13 10:04
 */
public class MainApplication  {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        System.in.read();
    }
}
