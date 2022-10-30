package com.wh_1215.pattern.adapter.object_adapter;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 14:08
 * 具体的SD卡类
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello world SDCard";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg :" + msg);
    }
}
