package com.designpatterns.pattern.factory.abstact_factory;

/**
 * @author tanyun
 * @Description 抽象工厂
 * @date 2021/12/9 21:24
 */
public interface Factory {

    /**
     * 生产咖啡
     * @return
     */
    Coffee createCoffee();

    /**
     * 生产甜品
     * @return
     */
    Dessert createDessert();
}
