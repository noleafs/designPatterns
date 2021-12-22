package com.designpatterns.pattern.prototype.demo;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/17 20:06
 */
public class Client {

    @Test
    void copyObject() throws CloneNotSupportedException {
        // 创建一个原型类对象
        Realizetype realizetype = new Realizetype();

        Object realizetypeCopy = realizetype.clone();
        System.out.println(realizetype == realizetypeCopy);
    }
}
