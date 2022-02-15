package com.designpatterns.pattern.template;

/**
 * @author tanyun
 * @Description 炒菜心 （具体）
 * @date 2022/2/14 21:50
 */
public class ConcreateClass_CaiXin extends AbstractClass {

    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
