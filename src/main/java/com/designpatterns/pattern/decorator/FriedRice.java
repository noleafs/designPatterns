package com.designpatterns.pattern.decorator;

/**
 * @author tanyun
 * @Description 炒饭 具体构件角色
 * @date 2021/12/29 20:20
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cast() {
        return getPrice();
    }
}
