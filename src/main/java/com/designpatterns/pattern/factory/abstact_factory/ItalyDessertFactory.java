package com.designpatterns.pattern.factory.abstact_factory;

/**
 * @author tanyun
 * @Description 意大利风味
 * @date 2021/12/9 21:38
 */
public class ItalyDessertFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
