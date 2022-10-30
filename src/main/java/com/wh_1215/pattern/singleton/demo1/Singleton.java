package com.wh_1215.pattern.singleton.demo1;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/25 21:57
 * 饿汉式:静态成员变量
 */
public class Singleton {
    //1.私有构造方法
    private Singleton(){}
    //2.在本类中创建该类对象
    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
