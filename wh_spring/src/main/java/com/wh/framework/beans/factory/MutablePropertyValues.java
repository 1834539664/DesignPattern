package com.wh.framework.beans.factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 19:44
 * 用户储存和管理多个PropertyValue对象
 */
public class MutablePropertyValues implements Iterable<PropertyValue> {

    //定义List集合对象,用来存储PropertyValue对象
    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if (propertyValueList == null) {
            this.propertyValueList = new ArrayList<>();
        } else {
            this.propertyValueList = propertyValueList;
        }
    }

    //获取所有的PropertyValue对象,返回值以数组的形式
    public Properties[] getPropertyValues() {
        //将集合转换为数组返回即可
        return propertyValueList.toArray(new Properties[0]);
    }

    //根据name属性值获取PropertyValue对象
    public PropertyValue getPropertyValue(String propertyName) {
        //遍历集合对象
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(propertyValue)) {
                return propertyValue;
            }
        }
        return null;
    }

    //判断集合是否为空
    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }

    //添加PropertyValue对象
    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue) {
        //判断集合中存储的PropertyValue对象是否和传递进行的重复了,如果重复了,进行覆盖
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue currentPv = propertyValueList.get(i);
            if (currentPv.getName().equals(propertyValue)) {
                propertyValueList.set(i, propertyValue);
                return this;
            }
        }
        propertyValueList.add(propertyValue);
        return this;
    }

    //判断是否有指定name属性值的对象
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }

    //获取迭代器对象
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }
}
