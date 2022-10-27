package com.wh_1215.pattern.singleton.demo9;

import java.lang.reflect.Constructor;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 19:39
 * 演示反射破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception{
        //1.获取Singleton的字节码对象
        Class<Singleton> clazz = Singleton.class;
        //2.获取无参构造器方法独享
        Constructor<Singleton> cons = clazz.getDeclaredConstructor();
        //3.取消访问检查
        cons.setAccessible(true);
        //4.创建Singleton对象
        Singleton instance = cons.newInstance();
        Singleton instance1 = cons.newInstance();
        System.out.println(instance);//false 单例模式被破坏


    }
}
