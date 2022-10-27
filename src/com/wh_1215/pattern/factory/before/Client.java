package com.wh_1215.pattern.factory.before;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 22:00
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("American");
        System.out.println(coffee.getName());
    }
}
