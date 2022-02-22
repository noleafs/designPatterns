package com.designpatterns.pattern.observer;

/**
 * @author tanyun
 * @Description 抽象观察者
 * @date 2022/2/22 20:09
 */
public interface Observer {

    /**
     * 更新方法（通知方法）
     * @param message
     */
    void update(String message);
}
