package com.designpatterns.pattern.adapter.class_adapter;

/**
 * @author tanyun
 * @Description 类适配器
 * @date 2021/12/22 20:47
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        writeTF(msg);
    }

}


