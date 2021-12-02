package com.designpatterns.pattern.singleton.demo2;

/**
 * @author tanyun
 * @Description
 * @date 2021/11/29 22:57
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("是否为同一个对象： " + (instance == Singleton.getInstance()));
    }
}
