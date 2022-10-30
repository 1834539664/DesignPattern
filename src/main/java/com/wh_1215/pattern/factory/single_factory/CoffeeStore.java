package com.wh_1215.pattern.factory.single_factory;



/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 21:56
 */
public class CoffeeStore {

public Coffee orderCoffee(String type){
    Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

    coffee.addMilk();
    coffee.addSugar();
    return coffee;
}
}
