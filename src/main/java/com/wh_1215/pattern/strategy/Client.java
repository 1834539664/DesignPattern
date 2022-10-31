package com.wh_1215.pattern.strategy;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/31 19:20
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new StrategyA();
        SalesMan salesMan = new SalesMan(strategy);
        salesMan.salesManShow();

        System.out.println("================");

        Strategy strategy1 = new StrategyB();
        SalesMan salesMan1 = new SalesMan(strategy1);
        salesMan1.salesManShow();

        System.out.println("======================");
        Strategy strategy2 = new StrategyC();
        SalesMan salesMan2 = new SalesMan(strategy2);
        salesMan2.salesManShow();
    }
}
