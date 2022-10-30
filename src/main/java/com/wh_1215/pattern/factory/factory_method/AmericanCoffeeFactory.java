package com.wh_1215.pattern.factory.factory_method;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 22:47
 * 美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
