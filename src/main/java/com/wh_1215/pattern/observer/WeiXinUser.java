package com.wh_1215.pattern.observer;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/1 22:02
 * 具体的观察者角色类
 */
public class WeiXinUser implements Observer {
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
