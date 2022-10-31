package com.wh_1215.pattern.strategy;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/31 19:15
 * 具象策略A
 */
public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
