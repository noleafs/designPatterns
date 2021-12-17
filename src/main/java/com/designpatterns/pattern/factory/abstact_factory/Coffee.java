package com.designpatterns.pattern.factory.abstact_factory;

/**
 * @author tanyun
 * @Description coffee抽象类
 * @date 2021/12/6 21:39
 */
public abstract class Coffee {

    /**
     * 咖啡名称
     * @return
     */
    public abstract String getName();

    /**
     * 加糖功能
     */
    void addSugar() {
        System.out.println("加糖");
    }

    /**
     * 加奶功能
     */
    void addMilk() {
        System.out.println("加奶");
    }


}
