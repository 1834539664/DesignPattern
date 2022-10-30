package com.wh_1215.pattern.adapter.object_adapter;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 14:05
 * 适配者类
 */
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello world TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg :" + msg);
    }
}
