package com.wh_1215.pattern.proxy.jdk_proxy;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 21:55
 * 火车站类
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
