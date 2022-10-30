package com.wh_1215.pattern.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 16:03
 */
public class Decorator {
    public static void main(String[] args) throws Exception {
        //说明
        //1.InputStream是抽象类,类似FastFoot
        //2.FileInputStream是InputStream的子类,是被修饰者,类似FriedRice
        //3.FilterInputStream 是InputStream的子类,是抽象的修饰者,类似我们前面的Garnish
        //4.DataInputStream是FilterInputStream子类,具体的修饰者,类似Egg,Bacon
        //5.FilterInputStream 类 有 protected volatile InputStream in;即含被修饰者
        //6.分析得出在jdk的io体系中,就是使用了装饰者模式
        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\TestData\\a.txt"));
        System.out.println(dis.read());
        dis.close();
    }
}
