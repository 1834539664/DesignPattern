package com.wh_1215.pattern.singleton.demo7;



/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 19:25
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance1==instance);
    }
}
