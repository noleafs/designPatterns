package com.designpatterns.pattern.adapter.object_adapter;

/**
 * @author tanyun
 * @Description 具体的SD卡
 * @date 2021/12/22 20:37
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "读取了SD卡";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("向SD卡中写入了： " + msg);
    }
}
