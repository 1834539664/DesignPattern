package com.wh_1215.pattern.adapter.class_adapter;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 14:07
 * 目标接口
 */
public interface SDCard {
    //从SD卡中读取数据
    String readSD();

    //向SD卡写数据
    void writeSD(String msg);
}
