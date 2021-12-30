package com.designpatterns.pattern.decorator;

/**
 * @author tanyun
 * @Description 培根类（具体的装饰者角色）
 * @date 2021/12/29 20:46
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }
    @Override
    public float cast() {
        // 获取培根以及快餐的价格
        return getPrice() + getFastFood().cast();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
