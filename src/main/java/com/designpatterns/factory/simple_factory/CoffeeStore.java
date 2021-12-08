package com.designpatterns.factory.simple_factory;

/**
 * @author tanyun
 * @Description 咖啡店
 * @date 2021/12/6 21:46
 */
public class CoffeeStore {

    public final static String AMERICAN = "american";
    public final static String LATTE = "latte";

    /**
     * 点咖啡功能
     * @param type 那种咖啡
     * @return
     */
    public Coffee orderCoffee(String type) {
        // 创建工厂对象,生产咖啡
        SimpleCoffeeFactory coffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(type);
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
