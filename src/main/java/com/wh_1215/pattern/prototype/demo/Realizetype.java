package com.wh_1215.pattern.prototype.demo;

import java.io.Serializable;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 15:46
 * 注意:clone方法由object实现,并非Cloneable规定,Cloneable接口只起到一个标识作用,
 * 告诉jvm这个类可以clone,如果没有实现Cloneable接口,jvm会报错
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体的原型对象创建完成");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        return (Realizetype) super.clone();
    }
}
