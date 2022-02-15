package com.designpatterns.pattern.strategy;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2022/2/15 18:19
 */
public class Client {

    @Test
    void testStrategy() {
        // 促销活动
        StrategyA strategyA = new StrategyA();
        SalesMan salesMan = new SalesMan(strategyA);
        salesMan.salesManShow();

        // 使用另外一个促销活动
        StrategyB strategyB = new StrategyB();
        salesMan.setStrategy(strategyB);
        salesMan.salesManShow();
    }
}
