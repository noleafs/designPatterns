package com.designpatterns.pattern.flyweight;

import org.junit.jupiter.api.Test;

/**
 * 享元模式
 * @author tanyun
 * @Description
 * @date 2022/2/14 20:35
 */
public class Client {

    @Test
    void testFlweight() {
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox iBox = boxFactory.getShape("I");
        iBox.display("红色");

        AbstractBox oBox = boxFactory.getShape("O");
        oBox.display("蓝色");

        AbstractBox oBox2 = boxFactory.getShape("O");
        oBox2.display("彩色");
        System.out.println(oBox == oBox2);
    }
}
