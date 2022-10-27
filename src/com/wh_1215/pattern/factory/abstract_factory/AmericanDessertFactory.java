package com.wh_1215.pattern.factory.abstract_factory;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.wh_1215.pattern.factory.factory_method.AmericanCoffee;
import com.wh_1215.pattern.factory.factory_method.Coffee;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 14:40
 * 美式风味的甜品工厂
 * 生产美卡咖啡和抹茶慕斯
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
