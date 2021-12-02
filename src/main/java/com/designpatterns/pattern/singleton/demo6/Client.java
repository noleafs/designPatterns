package com.designpatterns.pattern.singleton.demo6;

/**
 * @author tanyun
 * @Description
 * @date 2021/11/30 23:39
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
    }
}
