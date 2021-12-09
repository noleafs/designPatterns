package com.designpatterns.factory.factory_method;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/9 0:21
 */
public class ClientTest {

    @Test
    void testCoffeeStore() {
        // 咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();
        CoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        coffeeStore.setFactory(americanCoffeeFactory);

        // 点咖啡
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
