package com.designpatterns.pattern.factory.static_simple_factory;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/6 22:56
 */
class ClientTest {

    @Test
    void testFactory() {
        // 创建咖啡店
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee americanCoffee = coffeeStore.orderCoffee(CoffeeStore.AMERICAN);
        System.out.println(americanCoffee.getName());
    }
}
