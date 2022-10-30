package com.wh_1215.pattern.bridge;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 21:12
 */
public class HuaWei implements Brand{
    @Override
    public void open() {
        System.out.println("华为手机开机了");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机了");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
