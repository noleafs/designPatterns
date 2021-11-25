package com.designpatterns.principles.demo4.after;

/**
 * @author tanyun
 * @Description 不锈钢门
 * @date 2021/11/25 22:21
 */
public class StainlessSteelDoor implements AntiTheft,FireProof,WaterProof {

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }

    @Override
    public String toString() {
        this.antiTheft();
        this.fireProof();
        this.waterProof();
        return "";
    }
}
