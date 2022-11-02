package com.wh_1215.pattern.iterator;

import java.util.List;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 20:56
 * 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    private int position = 0; //用来记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        //从集合中获取指定位置的元素
        return list.get(position++);
    }
}
