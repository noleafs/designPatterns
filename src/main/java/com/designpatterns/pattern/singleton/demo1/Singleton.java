package com.designpatterns.pattern.singleton.demo1;

/**
 * @author tanyun
 * @Description 饿汉式 单例模式
 * @date 2021/11/29 22:43
 */
public class Singleton {
    /**
     * 2.在本类中创建本类对象
     */
    private static Singleton instance = new Singleton();

    /**
     * 1. 私有构造方法
     */
    private Singleton() {

    }

    /**
     * 3. 提供一个公共的访问方式，让外界获取该对象
     */
    public static Singleton getInstance() {
        return instance;
    }


}
