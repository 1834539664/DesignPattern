package com.wh_1215.pattern.factory.before;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 21:56
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        //声明Coffee类型的变量,根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if (type.equals("American")){
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起,你所点的咖啡没有");
        }
        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
