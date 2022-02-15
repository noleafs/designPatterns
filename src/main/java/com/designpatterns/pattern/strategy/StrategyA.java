package com.designpatterns.pattern.strategy;

/**
 * @author tanyun
 * @Description 具体策略类，封装算法
 * @date 2022/2/15 18:11
 */
public class StrategyA implements Strategy {

    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
