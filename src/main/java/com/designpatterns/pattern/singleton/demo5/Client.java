package com.designpatterns.pattern.singleton.demo5;
/**
 * @author tanyun
 * @Description
 * @date 2021/11/29 23:16
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}
