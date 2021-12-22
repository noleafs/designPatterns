package com.designpatterns.pattern.proxy.static_proxy;

/**
 * @author tanyun
 * @Description 目标对象
 * @date 2021/12/20 20:16
 */
public class TrainStation implements SellTickets {


    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
