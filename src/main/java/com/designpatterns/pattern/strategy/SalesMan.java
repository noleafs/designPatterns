package com.designpatterns.pattern.strategy;

/**
 * @author tanyun
 * @Description 环境类
 * @date 2022/2/15 18:13
 */
public class SalesMan {

    /**
     * 聚合策略类对象
     */
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 展示给用户
     */
    public void salesManShow() {
        strategy.show();
    }
}
