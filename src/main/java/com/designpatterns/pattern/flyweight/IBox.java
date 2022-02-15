package com.designpatterns.pattern.flyweight;

/**
 * @author tanyun
 * @Description I图形类（具体享元角色）
 * @date 2022/2/14 20:30
 */
public class IBox extends AbstractBox {
    @Override
    public String getShape() {
        return "I";
    }
}
