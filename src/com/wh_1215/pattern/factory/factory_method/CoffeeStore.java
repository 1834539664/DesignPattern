package com.wh_1215.pattern.factory.factory_method;


/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 21:56
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
