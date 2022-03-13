package com.designpatterns.pattern.interpreter;

/**
 * @author tanyun
 * @Description 减法表达式
 * @date 2022/3/10 22:08
 */
public class Mins extends AbstractExpression{

    /**
     * -号左边的表达式
     */
    private AbstractExpression left;
    private AbstractExpression right;

    public Mins(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        // 将左边表达式和右边表达式的结果进行相加
        return left.interpret(context) - right.interpret(context);
    }


    @Override
    public String toString() {
        return "("+left.toString()+" - "+right.toString()+")";
    }
}
