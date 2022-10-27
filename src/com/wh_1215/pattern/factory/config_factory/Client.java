package com.wh_1215.pattern.factory.config_factory;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 15:15
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("American");
        System.out.println(coffee.getName());
    }
}
