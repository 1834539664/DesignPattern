package com.wh_1215.pattern.decorator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 15:32
 * 炒面类(具体构建类)
 */
public class FriedNoodles extends FastFoot{
    public FriedNoodles(){
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return 0;
    }
}
