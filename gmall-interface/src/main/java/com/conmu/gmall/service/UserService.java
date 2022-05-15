package com.conmu.gmall.service;

import com.conmu.gmall.bean.UserAddress;

import java.util.List;

/*
* 用户服务
* */
public interface UserService {

    /*
    * 按照用户id返回所有收货地址
    * */
    public List<UserAddress> getUserAddressList(String userId);
}
