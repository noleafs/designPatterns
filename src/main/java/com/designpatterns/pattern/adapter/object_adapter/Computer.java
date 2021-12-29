package com.designpatterns.pattern.adapter.object_adapter;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/22 20:40
 */
public class Computer {

    /**
     * 从SD卡中读取数据
     */
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }

}
