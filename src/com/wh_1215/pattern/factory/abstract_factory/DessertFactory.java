package com.wh_1215.pattern.factory.abstract_factory;

import com.wh_1215.pattern.factory.factory_method.Coffee;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 14:39
 */
public interface DessertFactory {
    //生产咖啡
    Coffee createCoffee();

    //生产甜品
    Dessert createDessert();
}
