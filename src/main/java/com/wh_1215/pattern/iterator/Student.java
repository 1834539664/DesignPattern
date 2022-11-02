package com.wh_1215.pattern.iterator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 20:54
 */
public class Student {
    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
