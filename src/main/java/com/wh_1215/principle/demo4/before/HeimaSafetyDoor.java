package com.wh_1215.principle.demo4.before;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/25 21:03
 * 黑马品牌的安全门
 */
public class HeimaSafetyDoor implements SafetyDoor{
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
