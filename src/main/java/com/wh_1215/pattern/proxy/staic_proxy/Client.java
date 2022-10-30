package com.wh_1215.pattern.proxy.staic_proxy;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 21:58
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();

    }
}
