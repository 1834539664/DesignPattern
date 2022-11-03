package com.wh.framework.beans.factory;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 19:37
 * 用来封装bean标签下的property标签的属性
 * 属性:
 * name
 * ref
 * value:给基本数据类型及String类型数据赋的值
 */
public class PropertyValue {

    private String name;
    private String ref;
    private String value;

    public PropertyValue(String name, String ref, String value) {
        this.name = name;
        this.ref = ref;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
