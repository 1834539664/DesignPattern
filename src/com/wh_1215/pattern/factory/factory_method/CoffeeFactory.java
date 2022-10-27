package com.wh_1215.pattern.factory.factory_method;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 22:46
 * 抽象工厂
 */
public interface CoffeeFactory {

    //创建咖啡对象的方法
    Coffee createCoffee();
}
