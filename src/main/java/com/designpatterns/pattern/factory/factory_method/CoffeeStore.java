package com.designpatterns.pattern.factory.factory_method;

/**
 * @author tanyun
 * @Description 咖啡店
 * @date 2021/12/6 21:46
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    /**
     * 使用哪一个工厂
     */
    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    /**
     * 点咖啡功能
     * @return
     */
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
