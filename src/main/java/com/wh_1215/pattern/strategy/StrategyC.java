package com.wh_1215.pattern.strategy;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/31 19:16
 * 具象策略C
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
