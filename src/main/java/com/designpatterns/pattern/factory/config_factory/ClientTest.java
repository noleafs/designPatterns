package com.designpatterns.pattern.factory.config_factory;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/14 19:05
 */
class ClientTest {

    @Test
    void testFactory() {
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
