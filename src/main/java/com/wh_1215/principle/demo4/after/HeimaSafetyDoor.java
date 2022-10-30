package com.wh_1215.principle.demo4.after;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/25 21:09
 */
public class HeimaSafetyDoor implements AntiTheft,FireProof,WaterProof{
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
}
