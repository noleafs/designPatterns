package com.designpatterns.principles.demo3.after;

/**
 * @author tanyun
 * @Description AMD cpu
 * @date 2021/11/22 22:53
 */
public class AmdCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("AMDCpu处理数据");
    }
}
