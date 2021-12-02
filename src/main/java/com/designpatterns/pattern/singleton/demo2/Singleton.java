package com.designpatterns.pattern.singleton.demo2;

/**
 * @author tanyun
 * @Description 饿汉式： 静态代码块
 * @date 2021/11/29 22:56
 */
public class Singleton {
    private static Singleton instance;

    static {
        instance = new Singleton();
    }
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
