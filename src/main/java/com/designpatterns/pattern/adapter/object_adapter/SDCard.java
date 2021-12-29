package com.designpatterns.pattern.adapter.object_adapter;

/**
 * @author tanyun
 * @Description 目标接口
 * @date 2021/12/22 20:37
 */
public interface SDCard {

    String readSD();

    void writeSD(String msg);
}
