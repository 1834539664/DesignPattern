package com.wh_1215.pattern.builder.demo2;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 18:46
 */
public class Client {
    public static void main(String[] args) {
        //创建手机对象
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星")
                .memory("金士顿内存")
                .mainboard("华硕")
                .build();


        System.out.println(phone);
    }
}
