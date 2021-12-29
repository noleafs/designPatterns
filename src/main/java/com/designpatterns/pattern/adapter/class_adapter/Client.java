package com.designpatterns.pattern.adapter.class_adapter;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/22 20:44
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        // 读取sd卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("============================");

        // 使用该电脑读取TF卡中的数据
        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        msg = computer.readSD(sdAdapterTF);
        System.out.println(msg);

    }
}
