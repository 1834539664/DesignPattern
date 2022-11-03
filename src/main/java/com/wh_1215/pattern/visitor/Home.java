package com.wh_1215.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 22:06
 * 对象结构类(家类)
 */
public class Home {
    //声明一个集合对象,用来存储元素兑仓
    private List<Animal> nodeList = new ArrayList<>();

    //添加元素功能
    public void add(Animal animal){
        nodeList.add(animal);
    }

    public void action(Person person){
        //遍历集合,获取每一个元素,让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
