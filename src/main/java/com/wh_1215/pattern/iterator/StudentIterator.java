package com.wh_1215.pattern.iterator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 20:55
 * 抽象迭代器角色接口
 */
public interface StudentIterator {

    //判断是否还有元素
    boolean hasNext();

    //获取下一个元素
    Student next();


}
