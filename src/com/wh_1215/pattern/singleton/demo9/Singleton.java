package com.wh_1215.pattern.singleton.demo9;

import java.io.Serializable;

/**
 * 静态内部类方式
 */
public class Singleton implements Serializable {

    private  static boolean flag =false;
    //私有构造方法
    private Singleton() {
        synchronized (Singleton.class){
            if (flag){
                throw new  RuntimeException("不能创建多个对象");
            }
            flag = true;
        }

    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}