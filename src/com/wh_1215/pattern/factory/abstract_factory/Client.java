package com.wh_1215.pattern.factory.abstract_factory;


import com.wh_1215.pattern.factory.factory_method.Coffee;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 14:43
 */
public class Client {
    public static void main(String[] args) {
        //创建的是意大利风味甜品工厂对象
        //ItalyDessertFactory factory = new ItalyDessertFactory();
        //创建美食风味的甜品工厂对象
        AmericanDessertFactory factory = new AmericanDessertFactory();
        //获取对应的咖啡
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();


    }
}
