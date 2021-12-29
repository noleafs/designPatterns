package com.designpatterns.pattern.adapter.object_adapter;

/**
 * @author tanyun
 * @Description 对象适配器
 * @date 2021/12/28 19:48
 */
public class SDAdapterTF implements SDCard {
    /**
     * 声明适配者类
     */
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
