package com.wh_1215.pattern.decorator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 15:42
 */
public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFoot food = new FriedRice();
        System.out.println(food.getDesc() + " " + food.cost() + "元");
        System.out.println("=================");
        //在上面的炒饭中加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");
        System.out.println("===================");
        //再加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");
        System.out.println("=============");
        food = new Bacon(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");
    }
}
