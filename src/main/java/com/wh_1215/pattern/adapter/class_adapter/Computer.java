package com.wh_1215.pattern.adapter.class_adapter;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 14:10
 * 计算机类
 */
public class Computer {
    //从SD卡中读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
