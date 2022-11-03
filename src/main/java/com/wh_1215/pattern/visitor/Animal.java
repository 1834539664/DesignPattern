package com.wh_1215.pattern.visitor;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 22:01
 * 抽象元素角色类
 */
public interface Animal {
    //接收访问者访问功能
    void accept(Person person);
}
