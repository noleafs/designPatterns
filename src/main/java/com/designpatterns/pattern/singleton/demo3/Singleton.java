package com.designpatterns.pattern.singleton.demo3;

/**
 * @author tanyun
 * @Description 懒汉式 单例模式 此单例模式只能用于单线程下，多线程下会有线程安全问题
 * @date 2021/11/29 22:58
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        // 判断instance是否为null， 如果为null则还没有创建Singleton对象， 需要创建一个
        if (instance == null) {
            /*
                这里会有一个问题，如果两个线程同时调用此方法，线程1到这里的时候正好上下文切换正好切换为了线程二
                而此时线程一的instance还没有赋值，instance == null， 线程二也会进行到条件中，线程一、线程二此时都在条件中 都会进行
                new Singleton() 然后返回，此时这两个对象就不是相等的了，不构成单例了
             */

            instance = new Singleton();
        }
        return instance;
    }
}
