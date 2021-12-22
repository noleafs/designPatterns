package com.designpatterns.pattern.proxy.cglib_proxy;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/21 19:43
 */
public class CglibProxyTest {

    @Test
    void proxyTest() {
        // 创建工厂对象
        ProxyFactory proxyFactory = new ProxyFactory(new TrainStation());
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
