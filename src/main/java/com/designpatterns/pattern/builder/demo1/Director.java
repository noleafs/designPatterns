package com.designpatterns.pattern.builder.demo1;

/**
 * @author tanyun
 * @Description 指挥者类
 * @date 2021/12/18 22:35
 */
public class Director {

    /**
     * 声明builder类型的变量
     */
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 组装自行车
     */
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}
