package com.designpatterns.pattern.singleton.demo8;

import java.io.Serializable;

/**
 *  JVM 在加载外部类的过程中, 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。
 *      静态属性由于被 static 修饰，保证只被实例化一次，并且严格保证实例化顺序。
 * @author tanyun
 * @Description 懒汉 静态内部类方式
 * @date 2021/11/30 23:13
 */
public class Singleton implements Serializable {

    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class) {
          /*
            解决反射破坏单例模式需要添加的代码
            flag 是否是true， 如果是true， 说明非第一次访问， 直接抛出异常
         */
            if (flag) {
                throw new RuntimeException();
            }
            flag = true;
        }
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



}

