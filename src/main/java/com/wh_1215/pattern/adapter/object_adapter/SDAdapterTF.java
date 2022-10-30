package com.wh_1215.pattern.adapter.object_adapter;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 14:14
 * 适配器类 (类适配器模式)
 */
public class SDAdapterTF implements SDCard {
    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }


    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
