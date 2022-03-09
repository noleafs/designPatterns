package com.designpatterns.pattern.visitor;

/**
 * @author tanyun
 * @Description 具体访问者角色类
 * @date 2022/3/8 20:46
 */
public class Owner implements Person {

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }
}
