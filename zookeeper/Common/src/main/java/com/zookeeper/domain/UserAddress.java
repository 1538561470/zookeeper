package com.zookeeper.domain;

import java.io.Serializable;

/**
 * @Description:
 * @ClassName: UserAddress
 * @Author: zxy
 * @Date: 2023/6/12 17:06
 */
public class UserAddress implements Serializable {

    private Integer id;
    //声明id、用户地址、住户名称、联系方式等属性
    private String userId;
    private String userAddress;
    private String consignee;
    private String phoneNum;
    private String isDefault;

    public UserAddress() {
    }

    public UserAddress(Integer id, String userId, String userAddress, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userId = userId;
        this.userAddress = userAddress;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", consignee='" + consignee + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isDefault='" + isDefault + '\'' +
                '}';
    }
}
