package com.designpatterns.pattern.builder.demo1;

/**
 * @author tanyun
 * @Description ofo单车构建者， 用来构建ofo单车
 * @date 2021/12/18 22:33
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
