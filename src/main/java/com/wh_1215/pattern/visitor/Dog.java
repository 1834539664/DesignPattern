package com.wh_1215.pattern.visitor;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 22:03
 * 具体元素角色类(宠物狗)
 */
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃,汪汪汪...");
    }
}
