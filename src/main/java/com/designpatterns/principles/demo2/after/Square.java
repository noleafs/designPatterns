package com.designpatterns.principles.demo2.after;

/**
 * @author tanyun
 * @Description 正方形
 * @date 2021/11/22 20:52
 */
public class Square implements Quadrilateral {

    /**
     * 边
     */
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }
    @Override
    public double getWidth() {
        return side;
    }
}
