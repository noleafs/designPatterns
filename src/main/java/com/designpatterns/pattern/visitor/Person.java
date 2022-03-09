package com.designpatterns.pattern.visitor;

/**
 * @author tanyun
 * @Description 抽象访问者
 * @date 2022/3/8 20:04
 */
public interface Person {
    /**
     * 给狗喂食
     * @param dog
     */
    void feed(Dog dog);
    void feed(Cat cat);

}
