package com.designpatterns.pattern.singleton.demo8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author tanyun
 * @Description 反射破坏单例模式
 * @date 2021/12/2 22:34
 */
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1. 获取字节码对象
        Class<Singleton> singletonClass = Singleton.class;
        // 2. 获取私有无参构造方法对象
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
        // 3. 取消访问检查
        constructor.setAccessible(true);
        // 4. 创建对象
        Singleton singleton = constructor.newInstance();
        Singleton singleton1 = constructor.newInstance();
        System.out.println(singleton ==  singleton1);

    }
}
