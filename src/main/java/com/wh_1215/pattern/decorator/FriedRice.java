package com.wh_1215.pattern.decorator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 15:30
 * 炒饭类(具体构建角色)
 */
public class FriedRice extends FastFoot{

    public FriedRice(){
        super(10,"炒饭");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
