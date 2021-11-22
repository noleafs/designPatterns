package com.designpatterns.principles.demo3.after;

/**
 * @author tanyun
 * @Description 英特尔CPU
 * @date 2021/11/22 22:18
 */
public class IntelCpu implements Cpu{
    /**
     * 处理数据
     */
    @Override
    public void run() {
        System.out.println("英特尔CPU处理数据");
    }
}
