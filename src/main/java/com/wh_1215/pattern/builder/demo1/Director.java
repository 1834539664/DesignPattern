package com.wh_1215.pattern.builder.demo1;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 17:16
 * 指挥者类
 */
public class Director {
    //声明Builder类型的对象
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //组装自行车
    public Bike construct() {
        builder.buildSeat();
        builder.buildFrame();
        return builder.crateBike();
    }
}
