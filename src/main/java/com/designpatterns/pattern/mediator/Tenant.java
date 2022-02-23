package com.designpatterns.pattern.mediator;

/**
 * @author tanyun
 * @Description 具体的同事角色类（租客）
 * @date 2022/2/22 21:26
 */
public class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 和中介联系 沟通的方法
     */
    public void constact(String message) {
        super.mediator.constact(message, this);
    }

    /**
     * 获取信息
     */
    public void getMessage(String message) {
        System.out.println("租房者" + name + "获取到的信息是" +  message);
    }

}
