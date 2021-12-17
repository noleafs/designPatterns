package com.designpatterns.pattern.factory.abstact_factory;

/**
 * @author tanyun
 * @Description 美式风味工厂
 * @date 2021/12/9 21:26
 */
public class AmericanDessertFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
