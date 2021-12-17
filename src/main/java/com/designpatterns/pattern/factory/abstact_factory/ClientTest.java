package com.designpatterns.pattern.factory.abstact_factory;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/9 21:42
 */
public class ClientTest {

    @Test
    void testAbstractFactory() {
        // 创建美式风味工厂
        AmericanDessertFactory americanDessertFactory = new AmericanDessertFactory();
        Coffee coffee = americanDessertFactory.createCoffee();
        Dessert dessert = americanDessertFactory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
