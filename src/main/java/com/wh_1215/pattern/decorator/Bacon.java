package com.wh_1215.pattern.decorator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 15:40
 */
public class Bacon extends Garnish {
    @Override
    public float cost() {
        return getPrice() + getFastFoot().cost();
    }

    public Bacon(FastFoot fastFoot) {
        super(fastFoot, 2, "培根");
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFoot().getDesc();
    }

}
