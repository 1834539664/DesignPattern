package com.wh_1215.pattern.strategy;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/31 19:18
 * 促销员(环境类)
 */
public class SalesMan {
    //聚合策略类对象
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //由促销员展示活动给用户
    public void salesManShow(){
        strategy.show();
    }
}
