package com.designpatterns.factory.simple_factory;

import static com.designpatterns.factory.simple_factory.CoffeeStore.AMERICAN;
import static com.designpatterns.factory.simple_factory.CoffeeStore.LATTE;
/**
 * @author tanyun
 * @Description 简单工厂模式
 * @date 2021/12/6 22:42
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if (AMERICAN.equals(type)) {
            coffee = new AmericanCoffee();
        } else if (LATTE.equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("此咖啡店没有此咖啡");
        }

        return coffee;
    }
}
