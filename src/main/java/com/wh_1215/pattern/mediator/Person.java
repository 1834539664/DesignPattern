package com.wh_1215.pattern.mediator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 19:41
 * 抽象同事类
 */
public abstract class Person {

    protected String name;
    protected Mediator mediator;//中介

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }


}
