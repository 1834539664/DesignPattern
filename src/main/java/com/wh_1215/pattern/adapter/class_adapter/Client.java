package com.wh_1215.pattern.adapter.class_adapter;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 14:12
 */
public class Client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        //读取sd卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("==============================");
        //使用该计算机读取TF卡中的数据
        //定义适配器类
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
