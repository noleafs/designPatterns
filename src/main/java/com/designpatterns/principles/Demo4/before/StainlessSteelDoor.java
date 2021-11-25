package com.designpatterns.principles.Demo4.before;

/**
 * @author tanyun
 * @Description 不锈钢防盗门
 * @date 2021/11/23 23:42
 */
public class StainlessSteelDoor implements SafetyDoor {
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
        antiTheft();
        fireProof();
        waterProof();
        return "";
    }
}
