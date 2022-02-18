package com.designpatterns.pattern.command;

import java.util.Map;

/**
 * @author tanyun
 * @Description 具体的命令类
 * @date 2022/2/16 20:48
 */
public class OrderCommand implements Command {

    /**
     * 持有接收者对象
     */
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;

    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        for (Map.Entry<String, Integer> stringIntegerEntry : foodDir.entrySet()) {
            receiver.makeFood(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
        System.out.println(order.getDiningTable() + "桌的饭制作完毕");
    }
}
