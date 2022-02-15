package com.designpatterns.pattern.flyweight;

/**
 * @author tanyun
 * @Description O图形类（具体享元角色）
 * @date 2022/2/14 20:30
 */
public class OBox extends AbstractBox {
    @Override
    public String getShape() {
        return "O";
    }
}
