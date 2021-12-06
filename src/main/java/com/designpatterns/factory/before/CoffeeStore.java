package com.designpatterns.factory.before;

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
        Coffee coffee = null;

        // 如果需要增加新的咖啡种类，就需要修改此代码，就违背了开闭原则
        if (AMERICAN.equals(type)) {
            coffee = new AmericanCoffee();
        } else if (LATTE.equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("此咖啡店没有此咖啡");
        }

        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
