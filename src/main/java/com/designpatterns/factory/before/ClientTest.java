package com.designpatterns.factory.before;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/6 22:09
 */
class ClientTest {

    @Test
    void testCoffee() {
        // 1.创建咖啡店类
        CoffeeStore coffeeStore = new CoffeeStore();
        // 2.点咖啡
        Coffee americanCoffee = coffeeStore.orderCoffee(CoffeeStore.AMERICAN);
        System.out.println(americanCoffee.getName());

        Coffee latteCoffee = coffeeStore.orderCoffee(CoffeeStore.LATTE);
        System.out.println(latteCoffee.getName());
    }


}
