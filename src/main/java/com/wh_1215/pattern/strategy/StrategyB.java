package com.wh_1215.pattern.strategy;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/31 19:16
 * 具象策略B
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
