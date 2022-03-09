package com.designpatterns.pattern.visitor;

/**
 * @author tanyun
 * @Description 具体元素角色类（宠物狗）
 * @date 2022/3/8 20:08
 */
public class Dog implements Animal{

    @Override
    public void accept(Person person) {
        // 访问者给宠物狗喂食
        person.feed(this);
        System.out.println("好好吃，汪汪汪。。。");
    }
}
