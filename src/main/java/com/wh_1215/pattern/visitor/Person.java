package com.wh_1215.pattern.visitor;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 21:58
 * 抽象访问者角色类
 */
public interface Person {
    //喂食宠物猫
    void feed(Cat cat);
    //喂食宠物狗
    void feed(Dog dog);
}
