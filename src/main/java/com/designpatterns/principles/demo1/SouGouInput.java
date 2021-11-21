package com.designpatterns.principles.demo1;

/**
 * @author tanyun
 * @Description 搜狗输入法
 * @date 2021/11/21 19:34
 */
public class SouGouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }

}
