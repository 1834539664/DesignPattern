package com.wh_1215.pattern.factory.config_factory;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 21:53
 * 咖啡类
 */
public abstract class Coffee {

    public abstract String getName();

    //加糖
    public void addSugar(){
        System.out.println("加糖");
    }
    //加奶
    public void addMilk(){
        System.out.println("加奶");
    }


}
