package com.designpatterns.pattern.facade;

import org.junit.jupiter.api.Test;

/**
 * 外观模式测试
 * @author tanyun
 * @Description
 * @date 2022/2/10 21:05
 */
public class Client {

    @Test
    void testFacade() {
        // 创建智能音响对象（也就是外观对象）
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        // 控制家电
        smartAppliancesFacade.say("打开家电");
        System.out.println("================================");
        smartAppliancesFacade.say("关闭家电");
    }
}
