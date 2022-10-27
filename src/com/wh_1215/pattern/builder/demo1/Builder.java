package com.wh_1215.pattern.builder.demo1;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 17:08
 */
public abstract class Builder {
    //声明bike类型的变量,并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    //构建自行车

    public abstract Bike crateBike();

}
