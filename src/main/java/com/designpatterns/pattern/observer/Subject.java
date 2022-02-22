package com.designpatterns.pattern.observer;

/**
 * @author tanyun
 * @Description 抽象主题
 * @date 2022/2/22 20:08
 */
public interface Subject {

    /**
     * 添加观察者对象
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知观察者对象
     * @param message
     */
    void notify(String message);
}
