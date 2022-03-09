package com.designpatterns.pattern.visitor;

import org.junit.jupiter.api.Test;

/**
 * 访问者模式
 * @author tanyun
 * @Description
 * @date 2022/3/8 20:47
 */
public class Client {

    @Test
    void testVisitor() {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // 创建home对象
        Home home = new Home();
        home.add(dog);
        home.add(cat);

        // 访问者， 主人对象
        Owner owner = new Owner();
        // 主人喂食所有的宠物
        home.action(owner);

    }
}
