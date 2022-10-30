package com.wh_1215.pattern.decorator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 15:34
 * 装饰类(抽象装饰角色)
 */
public abstract class Garnish extends FastFoot {
    //声明快餐类的变量
    private FastFoot fastFoot;

    public Garnish(FastFoot fastFoot, float price, String desc) {
        super(price, desc);
        this.fastFoot = fastFoot;
    }

    public FastFoot getFastFoot() {
        return fastFoot;
    }

    public void setFastFoot(FastFoot fastFoot) {
        this.fastFoot = fastFoot;
    }
}
