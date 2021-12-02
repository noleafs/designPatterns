package com.designpatterns.pattern.singleton.demo1;

/**
 * @author tanyun
 * @Description 测试饿汉式单例模式
 * @date 2021/11/29 22:48
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("是否为同一个对象： " + (instance == Singleton.getInstance()));
    }
}
