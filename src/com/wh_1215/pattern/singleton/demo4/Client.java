package com.wh_1215.pattern.singleton.demo4;



/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 19:21
 */
public class Client {
    public static void main(String[] args) {
        //创建Singleton类的对象
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        //判断获取到的两个是否是同一个对象(比较内存中的地址)
        System.out.println(instance1 == instance);
    }
}
