package com.zookeeper.service;

import com.zookeeper.domain.UserAddress;

import java.util.List;

/**
 * @Description:
 * @ClassName: UserService
 * @Author: zxy
 * @Date: 2023/6/12 17:07
 */
public interface UserService {

    public List<UserAddress> getUserList(String userId);

}
