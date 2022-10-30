package com.wh_1215.pattern.bridge;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 20:55
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机了");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
