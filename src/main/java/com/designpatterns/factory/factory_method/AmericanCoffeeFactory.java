package com.designpatterns.factory.factory_method;

/**
 * @author tanyun
 * @Description 美式咖啡工厂，专用于生产美式咖啡
 * @date 2021/12/8 23:43
 */
public class AmericanCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
