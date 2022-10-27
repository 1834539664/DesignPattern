package com.wh_1215.pattern.factory.single_factory;




/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 22:00
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("American");
        System.out.println(coffee.getName());
    }
}
