package com.wh_1215.pattern.observer;


/**
 * @author WH
 * @version 1.0
 * @date 2022/11/1 21:56
 * 抽象主题角色类
 */
public interface Subject {
    //添加订阅者
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知观察者观察者更新消息
    void notify(String msg);
}
