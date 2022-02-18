package com.designpatterns.pattern.command;

/**
 * @author tanyun
 * @Description 厨师类(接收者对象)
 * @date 2022/2/16 20:45
 */
public class SeniorChef {

    public void makeFood(String name, int num) {
        System.out.println(num + "份" + name);
    }

}
