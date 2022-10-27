package com.wh_1215.pattern.singleton.demo2;

import javax.security.auth.login.CredentialException;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/25 22:03
 * 饿汉式:方式二:静态代码块
 */
public class Singleton {
    //1.私有构造方法
    private Singleton(){}
    //2.声明Singleton类型的静态变量
    private static Singleton instance;
    //3.在静态代码块中赋值
    static {
        instance = new Singleton();
    }
    //4.对外提供获取该类对象的方法
    public static Singleton getInstance(){
        return instance;
    }
}
