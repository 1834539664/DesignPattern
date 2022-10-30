package com.wh_1215.pattern.adapter.class_adapter;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 14:14
 * 适配器类 (类适配器模式)
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }



    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
