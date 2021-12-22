package com.designpatterns.pattern.proxy.jdk_proxy;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/20 20:57
 */
public class JdkProxyTest {

    /**
     * 测试jdk动态代理
     */
    @Test
    void jdkProxy() {
        // 创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        // 使用工厂获取代理对象
        SellTickets sellTickets = proxyFactory.getProxyObject();
        sellTickets.sell();

        System.out.println("代理类： " + sellTickets.getClass());

        while (true);
    }
}
