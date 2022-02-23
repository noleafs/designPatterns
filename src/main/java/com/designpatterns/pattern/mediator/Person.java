package com.designpatterns.pattern.mediator;

/**
 * @author tanyun
 * @Description 抽象同事类
 * @date 2022/2/22 21:24
 */
public abstract class Person {

    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }


}
