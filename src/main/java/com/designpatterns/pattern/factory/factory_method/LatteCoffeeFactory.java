package com.designpatterns.pattern.factory.factory_method;

/**
 * @author tanyun
 * @Description 拿铁咖啡工厂
 * @date 2021/12/9 0:02
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

}
