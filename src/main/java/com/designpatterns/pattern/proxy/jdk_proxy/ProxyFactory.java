package com.designpatterns.pattern.proxy.jdk_proxy;

import java.beans.Transient;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tanyun
 * @Description 获取代理的工厂类
 *      代理类也实现了对应的接口
 * @date 2021/12/20 20:41
 */
public class ProxyFactory {

    private Object sellTickets = new TrainStation();

    /**
     * @return 返回代理对象
     */
    public SellTickets getProxyObject() {
        /*
               ClassLoader loader: 用于加载代理类
              Class<?>[] interfaces： 代理类实现的接口的字节码对象
              InvocationHandler h ： 代理对象的调用处理程序
         */
        return (SellTickets) Proxy.newProxyInstance(
                sellTickets.getClass().getClassLoader(),
                sellTickets.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 代理对象， 在此基本不用
                     * @param method 对接口中的方法进行封装的method对象
                     * @param args 方法参数
                     * @return 目标方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理增强");
                        // 调用目标对象的方法
                        Object obj = method.invoke(sellTickets, args);
                        return obj;
                    }
                }
        );
    }

}
