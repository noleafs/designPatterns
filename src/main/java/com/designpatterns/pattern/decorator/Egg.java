package com.designpatterns.pattern.decorator;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/29 20:35
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 2, "鸡蛋");
    }

    /**
     * 计算总价
     * @return
     */
    @Override
    public float cast() {
        // 获取鸡蛋以及快餐的价格
        return getPrice() + getFastFood().cast();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
