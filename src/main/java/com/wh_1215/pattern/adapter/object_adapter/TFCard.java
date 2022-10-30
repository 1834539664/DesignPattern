package com.wh_1215.pattern.adapter.object_adapter;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 13:59
 * 适配者类的接口
 */
public interface TFCard {

    //从TF卡中读取数据
    String readTF();

    //向TF卡中写数据
    void writeTF(String msg);
}
