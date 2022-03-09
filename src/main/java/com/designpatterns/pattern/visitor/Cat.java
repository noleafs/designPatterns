package com.designpatterns.pattern.visitor;

/**
 * @author tanyun
 * @Description
 * @date 2022/3/8 20:05
 */
public class Cat implements Animal {

    @Override
    public void accept(Person person) {
        // 访问者给宠物猫喂食
        person.feed(this);
        System.out.println("好好吃， 喵喵喵。。。");
    }
}
