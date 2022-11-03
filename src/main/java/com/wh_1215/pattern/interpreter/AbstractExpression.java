package com.wh_1215.pattern.interpreter;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 14:24
 * 抽象表达式类
 */
public abstract class AbstractExpression {

    public abstract  int interpret(Context context);
}
