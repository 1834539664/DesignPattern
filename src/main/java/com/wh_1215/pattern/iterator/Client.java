package com.wh_1215.pattern.iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 21:04
 */
public class Client {
    public static void main(String[] args) {
        //创建聚合对象
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        //添加元素
        studentAggregate.addStudent(new Student("张三","001"));
        studentAggregate.addStudent(new Student("李四","002"));
        studentAggregate.addStudent(new Student("王五","003"));
        studentAggregate.addStudent(new Student("赵六","004"));

        //遍历聚合对象
        StudentIterator iterator = studentAggregate.getStudentIterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next);
        }

    }
}

class Test1{
    @Test
    void test(){
        ArrayList<Student> students = new ArrayList<>();
        students.iterator();
    }
}