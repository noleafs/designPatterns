package com.designpatterns.principles.demo3.after;

/**
 * @author tanyun
 * @Description 金士顿内存条
 * @date 2021/11/22 22:19
 */
public class KingstonMemory implements Memory{
    @Override
    public void save() {
        System.out.println("金士顿内存条");
    }
}
