package com.designpatterns.principles.demo2.before;

/**
 * @author tanyun
 * @Description
 * @date 2021/11/21 23:16
 */
public class RectangleDemo {

    public static void main(String[] args) {
        // 创建长方形
        Rectangle r = new Rectangle();
        r.setWidth(10);
        r.setLength(20);
        // 调用resize方法进行扩宽
        resize(r);
        // 打印
        printLengthAndWidth(r);

        System.out.println("==========================");

        // 创建正方形
        Square square = new Square();
        square.setWidth(20);
        // 扩宽
        resize(square);
        printLengthAndWidth(square);
    }

    /**
     * 扩宽方法
     * @param rectangle 长方形类
     */
    private static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    private static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(String.format("width: %s", rectangle.getWidth()));
        System.out.println(String.format("length: %s", rectangle.getLength()));
    }



}
