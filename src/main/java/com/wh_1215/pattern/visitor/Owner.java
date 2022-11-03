package com.wh_1215.pattern.visitor;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 22:04
 * 具体访问者角色类(主人类)
 */
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
