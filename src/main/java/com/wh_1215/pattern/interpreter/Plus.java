package com.wh_1215.pattern.interpreter;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 14:28
 * 加法表达式类
 */
public class Plus extends AbstractExpression {
    //+号左边的表达式
    private AbstractExpression left;
    //+号右边的表达式
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        //将左边表达式的结果和右边表达式的结果进行相加
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}
