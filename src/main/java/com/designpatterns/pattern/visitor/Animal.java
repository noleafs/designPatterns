package com.designpatterns.pattern.visitor;

/**
 * @author tanyun
 * @Description 抽象元素角色
 * @date 2022/3/8 20:03
 */
public interface Animal {

    /**
     * 给具体访问者访问的方法
     * @param person
     */
    void accept(Person person);
}
