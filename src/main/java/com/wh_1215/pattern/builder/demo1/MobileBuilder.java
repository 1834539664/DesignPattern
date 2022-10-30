package com.wh_1215.pattern.builder.demo1;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 17:10
 * 具体的构建者,用来构建摩拜单车对象
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike crateBike() {
        return super.bike;
    }
}
