package com.designpatterns.pattern.command;

import org.junit.jupiter.api.Test;

/**
 * 命令模式
 * @author tanyun
 * @Description
 * @date 2022/2/16 21:16
 */
public class Client {

    @Test
    void testCommand() {
        // 创建订单对象
        Order order = new Order();
        order.setDiningTable(1);
        order.setFood("可乐鸡翅", 1);
        order.setFood("凉拌黄瓜", 2);
        order.setFood("红烧肉", 1);
        order.setFood("紫菜蛋花汤", 1);
//
//        Order order2 = new Order();
//        order.setDiningTable(2);
//        order.setFood("肉丝盖饭", 1);
//        order.setFood("小杯雪碧", 2);

        // 创建厨师对象
        SeniorChef seniorChef = new SeniorChef();

        // 创建命令对象
        OrderCommand orderCommand = new OrderCommand(seniorChef, order);

        // 叫服务员, 服务员对象
        Waitor waitor = new Waitor();
        waitor.setCommand(orderCommand);
        // 服务员发起命令
        waitor.orderUp();

    }
}
