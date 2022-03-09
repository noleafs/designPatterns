package com.designpatterns.pattern.visitor;

/**
 * @author tanyun
 * @Description 具体访问者角色类（其它人）
 * @date 2022/3/8 20:48
 */
public class Someone implements Person {

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }
}
