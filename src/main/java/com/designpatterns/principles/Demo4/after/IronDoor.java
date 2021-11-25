package com.designpatterns.principles.Demo4.after;

/**
 * @author tanyun
 * @Description 铁门
 * @date 2021/11/25 22:32
 */
public class IronDoor implements AntiTheft, FireProof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public String toString() {
        this.antiTheft();
        this.fireProof();
        return super.toString();
    }
}
