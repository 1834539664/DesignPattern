package com.wh_1215.pattern.proxy.jdk_proxy;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 22:18
 * 动态代理(jdk)
 */
public class Client {
    public static void main(String[] args) {
        //1.获取代理对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //2.使用工厂对象的方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();


    }
}
