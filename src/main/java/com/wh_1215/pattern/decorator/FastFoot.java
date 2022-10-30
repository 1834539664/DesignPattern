package com.wh_1215.pattern.decorator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 15:28
 * 快餐类(抽象构建角色)
 */
public abstract class FastFoot {
    private float price; //价格
    private String desc; // 描述

    public FastFoot(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFoot() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();
}
