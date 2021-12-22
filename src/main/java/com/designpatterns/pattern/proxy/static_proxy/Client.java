package com.designpatterns.pattern.proxy.static_proxy;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description 静态代理测试
 * @date 2021/12/20 20:18
 */
class Client {

    @Test
    void trainStationTest() {
        // 创建代理对象
        ProxyPoint proxyPoint = new ProxyPoint(new TrainStation());
        proxyPoint.sell();
    }
}
