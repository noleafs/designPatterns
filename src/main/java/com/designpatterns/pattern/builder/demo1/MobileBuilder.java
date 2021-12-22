package com.designpatterns.pattern.builder.demo1;

/**
 * @author tanyun
 * @Description 具体构建者类, 用来构建摩拜单车
 * @date 2021/12/18 22:30
 */
public class MobileBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("炭纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }

}
