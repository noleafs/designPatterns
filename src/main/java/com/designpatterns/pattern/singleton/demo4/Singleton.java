package com.designpatterns.pattern.singleton.demo4;

/**
 * @author tanyun
 * @Description 单例 双重检查锁 懒汉式
 * @date 2021/11/29 23:38
 */
public class Singleton {

    /**
     * 需要加 volatile 不然可能会出现因为jvm的指令重排 而导致出现问题
     */
    private static volatile Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        // 第一次判断, 如果instance的值不为null，不需要抢占锁， 直接返回对象
        if (instance == null) {
            synchronized (Singleton.class) {
                // 第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
