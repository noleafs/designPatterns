package com.designpatterns.pattern.singleton.demo7;

import java.io.Serializable;

/**
 *  JVM 在加载外部类的过程中, 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。
 *      静态属性由于被 static 修饰，保证只被实例化一次，并且严格保证实例化顺序。
 * @author tanyun
 * @Description 懒汉 静态内部类方式
 * @date 2021/11/30 23:13
 */
public class Singleton implements Serializable {

    private Singleton() {

    }

    /**
     * 定义一个静态内部类
     */
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 提供访问方式
     *      第一次加载Singleton类时不会去初始化INSTANCE，只有第一次调用getInstance，虚拟机加载SingletonHolder
     *      并初始化INSTANCE，这样不仅能确保线程安全，也能保证 Singleton 类的唯一性。
     */
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 当进行反序列化时会自动调用此方法，如果定义了此方法，就返回这个方法的值，如果没有定义，则返回一个新new出的对象（解决序列化破坏问题）
     *          在ObjectInputStream 2087行调用了此方法
     *                               Object rep = desc.invokeReadResolve(obj);
     * @return
     */
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }


}

