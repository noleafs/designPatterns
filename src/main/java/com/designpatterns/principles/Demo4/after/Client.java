package com.designpatterns.principles.Demo4.after;

/**
 * 接口隔离原则：
 *          客户端不应该被迫依赖于它不使用的方法；一个类对另一个类的依赖应该建立在最小的接口上。
 * @author tanyun
 * @Description
 * @date 2021/11/25 22:22
 */
public class Client {
    public static void main(String[] args) {
        // 不锈钢门
        StainlessSteelDoor stainlessSteelDoor = new StainlessSteelDoor();
        System.out.println(stainlessSteelDoor);

        // 铁门
        System.out.println("=============== 铁门");
        IronDoor ironDoor = new IronDoor();
        System.out.println(ironDoor);
    }
}
