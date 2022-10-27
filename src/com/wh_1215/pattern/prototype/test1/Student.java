package com.wh_1215.pattern.prototype.test1;

import java.io.Serializable;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 16:14
 */
public class Student implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
