package com.wh_1215.pattern.iterator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 21:00
 * 抽象聚合角色接口
 */
public interface StudentAggregate {

    //添加学生功能
    void addStudent(Student student);
    //删除学生功能
    void removeStudent(Student student);
    //获取迭代器功能
    StudentIterator getStudentIterator();
}
