package com.designpatterns.pattern.factory.static_simple_factory;

import com.designpatterns.pattern.factory.simple_factory.CoffeeStore;

/**
 * @author tanyun
 * @Description 静态简单工厂模式
 * @date 2021/12/6 22:42
 */
public class StaticSimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if (CoffeeStore.AMERICAN.equals(type)) {
            coffee = new AmericanCoffee();
        } else if (CoffeeStore.LATTE.equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("此咖啡店没有此咖啡");
        }

        return coffee;
    }
}
