package com.designpatterns.pattern.prototype.demo;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/17 20:04
 */
public class Realizetype {

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        return (Realizetype) super.clone();
    }
}
