package com.designpatterns.pattern.observer;

/**
 * @author tanyun
 * @Description 具体的观察者角色类
 * @date 2022/2/22 20:18
 */
public class WeiXinUser implements Observer {

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " - " + message);
    }
}
