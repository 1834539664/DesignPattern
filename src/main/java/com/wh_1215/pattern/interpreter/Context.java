package com.wh_1215.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 14:25
 * 环境角色类
 */
public class Context {
    //定义一个map集合,用来存储变量及对应的值
    private Map<Variable, Integer> map = new HashMap<>();

    //添加变量的功能
    public void assign(Variable var, Integer val) {
        map.put(var, val);
    }

    //根据变量获取对应的值
    public int getValue(Variable var) {
        return map.get(var);
    }


}
