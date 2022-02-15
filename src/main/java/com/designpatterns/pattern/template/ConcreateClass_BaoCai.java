package com.designpatterns.pattern.template;

/**
 * @author tanyun
 * @Description 炒包菜 （具体）
 * @date 2022/2/14 21:50
 */
public class ConcreateClass_BaoCai extends AbstractClass {

    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
