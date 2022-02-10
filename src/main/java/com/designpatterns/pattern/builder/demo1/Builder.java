package com.designpatterns.pattern.builder.demo1;

/**
 * @author tanyun
 * @Description 抽象建造者类
 * @date 2021/12/18 22:20
 */
public abstract class Builder {

    /**
     * 声明bike类型的变量，并进行赋值
     */
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    /**
     * 构建自行车的方法
     */
    public abstract Bike createBike();

}
