package com.wh_1215.pattern.decorator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 15:37
 * 鸡蛋类(具体的装饰者角色)
 */
public class Egg extends Garnish {
    public Egg(FastFoot fastFoot) {
        super(fastFoot, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        //计算价格
        return getPrice() + getFastFoot().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFoot().getDesc();
    }
}
