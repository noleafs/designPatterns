package com.designpatterns.pattern.template;

/**
 * 模板方法模式
 * @author tanyun
 * @Description 抽象类（定义模板方法和基本方法）
 * @date 2022/2/14 21:34
 */
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public final void cookProcess() {
        this.pouroil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    public void pouroil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }


    /**
     * 倒蔬菜，基本方法中的抽象方法
     */
    public abstract void pourVegetable();

    /**
     * 倒调味料
     */
    public abstract void pourSauce();

    /**
     * 翻炒
     */
    public void fry() {
        System.out.println("炒啊炒啊炒到熟");
    }


}
