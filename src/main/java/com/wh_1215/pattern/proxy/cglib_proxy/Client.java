package com.wh_1215.pattern.proxy.cglib_proxy;



/**
 * @author WH
 * @version 1.0
 * @date 2022/10/28 19:05
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        //调用代理对象中的方法sell
        proxyObject.sell();

    }
}
