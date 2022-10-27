package com.wh_1215.principle.demo4.after;



/**
 * @author WH
 * @version 1.0
 * @date 2022/10/25 21:04
 */
public class Client {
    public static void main(String[] args) {
        HeimaSafetyDoor heimaSafetyDoor = new HeimaSafetyDoor();
        heimaSafetyDoor.antiTheft();
        heimaSafetyDoor.fireProof();
        heimaSafetyDoor.waterProof();

        System.out.println("--------------------------");
        ChuanzhiSafetyDoor chuanzhiSafetyDoor = new ChuanzhiSafetyDoor();
        chuanzhiSafetyDoor.antiTheft();
        chuanzhiSafetyDoor.fireProof();
    }
}
