package com.designpatterns.pattern.adapter.object_adapter;

/**
 * @author tanyun
 * @Description 适配者类
 * @date 2021/12/22 20:32
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TFCard 读取了数据";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("向TF卡中写入了： " + msg);
    }
}
