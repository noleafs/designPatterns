package com.designpatterns.pattern.decorator;

/**
 * 装饰器模式
 * @author tanyun
 * @Description
 * @date 2021/12/29 20:52
 */
public class Client {
    public static void main(String[] args) {
        // 炒饭
        FastFood fastFood = new FriedRice();
        System.out.println(fastFood.getDesc() + " " + fastFood.cast() + "元");

        // 鸡蛋炒饭
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc()  + " " + fastFood.cast() + "元");

        // 加培根
        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getDesc()  + " " + fastFood.cast() + "元");
    }
}
