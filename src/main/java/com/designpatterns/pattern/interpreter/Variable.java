package com.designpatterns.pattern.interpreter;

/**
 * @author tanyun
 * @Description 封装变量的类
 * @date 2022/3/10 21:56
 */
public class Variable extends AbstractExpression {

    /**
     * 声明存储变量名的成员变量
     */
    private String name;

    public Variable(String name) {
        this.name = name;
    }


    @Override
    public int interpret(Context context) {
        // 直接返回变量的值
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
