package com.designpatterns.pattern.decorator;

/**
 * @author tanyun
 * @Description 装饰者（抽象装饰者角色）核心
 * @date 2021/12/29 20:25
 */
public abstract class Garnish extends FastFood {

    /**
     * 声明快餐类变量
     */
    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }




}
