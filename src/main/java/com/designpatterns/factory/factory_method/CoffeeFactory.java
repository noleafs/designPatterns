package com.designpatterns.factory.factory_method;

/**
 * @author tanyun
 * @Description 抽象工厂 接口
 * @date 2021/12/8 23:29
 */
public interface CoffeeFactory {

    /**
     * 创建咖啡对象的方法
     * @return
     */
    Coffee createCoffee();
}
