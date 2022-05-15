package com.conmu.gmall.service.impl;



import com.conmu.gmall.bean.UserAddress;
import com.conmu.gmall.service.OrderService;
import com.conmu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* 1. 将服务提供者注册到注册中心（暴露服务）
*       1.1. 导入dubbo依赖 以及 zk客户端（curator）
*       1.2. 配置服务器
* 2. 让服务消费者去注册中心订阅服务提供者的服务地址
* */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired(required = false)
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id" + userId);
        //1. 查询用户收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
//        System.out.println(addressList);
    }
}
