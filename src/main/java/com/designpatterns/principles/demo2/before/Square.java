package com.designpatterns.principles.demo2.before;

/**
 * @author tanyun
 * @Description 正方形
 * @date 2021/11/21 23:13
 */
public class Square extends Rectangle{

    @Override
    public void setLength(double length) {
        super.setLength(length);
        setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

}
