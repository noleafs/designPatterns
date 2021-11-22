package com.designpatterns.principles.demo2.after;

/**
 *
 * @author tanyun
 * @Description 里氏替换原则
 * @date 2021/11/22 21:02
 */
public class RectangleDemo {

    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        // 扩宽
        resize(r);
        // 打印
        printLengthAndWidth(r);
    }

    /**
     * 扩宽方法
     * @param rectangle 长方形
     */
    private static void resize(Rectangle rectangle) {
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    /**
     * 打印长和宽
     * @param quadrilateral 四边形
     */
    private static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(String.format("长： %s， 宽： %s", quadrilateral.getLength(), quadrilateral.getWidth()));
    }

}
