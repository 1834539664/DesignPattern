package com.wh_1215.pattern.builder.demo1;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 17:19
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new OfoBuilder());
        Bike bike = director.construct();
        System.out.println(bike);
    }
}
