package com.designpatterns.pattern.decorator;

/**
 * 抽象构件角色
 * @author tanyun
 * @Description 快餐类
 * @date 2021/12/29 20:16
 */
public abstract class FastFood {

    /**
     * 价格
     */
    private float price;

    /**
     * 描述
     */
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 计算总价
     * @return
     */
    public abstract float cast();

}
