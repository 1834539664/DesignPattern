package com.wh_1215.pattern.visitor;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 22:01
 * 具体元素角色类
 */
public class Cat implements Animal{

    @Override
    public void accept(Person person) {
        person.feed(this); //给宠物猫喂食
        System.out.println("好好吃,喵喵喵...");
    }
}
