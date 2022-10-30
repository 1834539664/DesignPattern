package com.wh_1215.pattern.builder.demo1;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 17:14
 * OFO单车构建者
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike crateBike() {
        return super.bike;
    }
}
