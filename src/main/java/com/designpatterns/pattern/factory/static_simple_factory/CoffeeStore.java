package com.designpatterns.pattern.factory.static_simple_factory;

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
        // 使用工厂,生产咖啡
        Coffee coffee = StaticSimpleCoffeeFactory.createCoffee(type);
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
