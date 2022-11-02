package com.wh_1215.pattern.mediator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 19:45
 * 具体的同事角色类
 */
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }



    //和中介联系(沟通的方法)
    public void constact(String message) {
        mediator.constact(message, this);
    }

    //获取信息
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息是: " + message);
    }
}
