package com.designpatterns.pattern.builder.demo1;

/**
 * @author tanyun
 * @Description 测试建造者模式
 * @date 2021/12/18 22:38
 */
public class Client {

    public static void main(String[] args) {
        MobileBuilder mobileBuilder = new MobileBuilder();
        // 创建指挥者对象
        Director director = new Director(mobileBuilder);
        Bike construct = director.construct();
        System.out.println(construct);
    }
}
