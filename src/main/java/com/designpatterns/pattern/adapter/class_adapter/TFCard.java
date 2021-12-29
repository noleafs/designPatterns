package com.designpatterns.pattern.adapter.class_adapter;

/**
 * @author tanyun
 * @Description 适配者类的接口
 * @date 2021/12/22 20:30
 */
public interface TFCard {

    /**
     * 从TF卡中读取数据
     */
    String readTF();

    /**
     * 从TF卡中写数据
     */
    void writeTF(String msg);

}
