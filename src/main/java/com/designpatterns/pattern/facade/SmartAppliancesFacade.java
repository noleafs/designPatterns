package com.designpatterns.pattern.facade;

/**
 * @author tanyun
 * @Description 外观类，用户主要和该类对象进行交互，减轻复杂度
 * @date 2022/2/10 21:10
 */
public class SmartAppliancesFacade {
    /**
     * 聚合子系统对象
     */
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    /**
     * 通过语音控制 模仿而已
     * @param message
     */
    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")){
            off();
        } else {
            System.out.println("暂时没有此功能");
        }
    }

    /**
     * 一键关闭
     */
    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }

    /**
     * 一键打开
     */
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

}
