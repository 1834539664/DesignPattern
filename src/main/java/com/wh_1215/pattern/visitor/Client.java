package com.wh_1215.pattern.visitor;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 22:08
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());

        home.action(new Owner());
        System.out.println("================");
        home.action(new Someone());
    }
}
