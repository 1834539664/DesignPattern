package com.wh_1215.pattern.factory.single_factory;


/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 22:20
 * 简单咖啡机工厂类,专门用来生产咖啡
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {//有static是静态工厂
        //声明Coffee类型的变量,根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if (type.equals("American")) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起,你所点的咖啡没有");
        }

        return coffee;
    }
}
