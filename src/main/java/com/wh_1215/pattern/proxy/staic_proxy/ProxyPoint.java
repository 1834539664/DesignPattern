package com.wh_1215.pattern.proxy.staic_proxy;

import javafx.scene.shape.TriangleMesh;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 21:55
 * 代售点(代理类)
 */
public class ProxyPoint implements SellTickets{
    //声明火车站类对象
    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代理点收取一点服务费");
        trainStation.sell();
    }
}
