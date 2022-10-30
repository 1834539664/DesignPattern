package com.wh_1215.pattern.factory.abstract_factory;

import com.wh_1215.pattern.factory.factory_method.Coffee;
import com.wh_1215.pattern.factory.factory_method.LatteCoffee;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 14:42
 * 意大利风味甜品工厂:
 * 生产拿铁咖啡和提拉米苏甜品
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
