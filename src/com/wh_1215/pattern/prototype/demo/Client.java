package com.wh_1215.pattern.prototype.demo;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 15:49
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println(clone==realizetype);//false 对象不同,但是构造器没有启动,说明不是通过new 对象来实现的
        System.out.println(clone);
        System.out.println(realizetype);
    }
}
