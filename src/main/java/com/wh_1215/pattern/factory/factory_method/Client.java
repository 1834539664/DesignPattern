package com.wh_1215.pattern.factory.factory_method;



/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 22:52
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        AmericanCoffeeFactory factory = new AmericanCoffeeFactory();
        coffeeStore.setFactory(factory);

        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
   
    }
}
