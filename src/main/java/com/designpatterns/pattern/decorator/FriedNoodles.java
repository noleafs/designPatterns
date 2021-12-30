package com.designpatterns.pattern.decorator;

/**
 * @author tanyun
 * @Description 具体构件 炒面
 * @date 2021/12/29 20:23
 */
public class FriedNoodles extends FastFood {
    public FriedNoodles() {
        super(8, "炒面");
    }

    @Override
    public float cast() {
        return getPrice();
    }
}
