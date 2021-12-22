package com.designpatterns.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author tanyun
 * @Description 代理对象工厂，用来获取代理对象, Cglib代理依靠继承实现
 * @date 2021/12/21 19:35
 */
public class ProxyFactory implements MethodInterceptor {

    /**
     * 声明火车站对象
     */
    private Object station;
    public ProxyFactory(Object object) {
        this.station = object;
    }

    /**
     * 获取代理对象
     * @return
     */
    public TrainStation getProxyObject() {
        // 1.创建Enhancer对象， 类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建代理对象
       TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理增强");
        Object invoke = method.invoke(station, objects);
        return invoke;
    }
}
