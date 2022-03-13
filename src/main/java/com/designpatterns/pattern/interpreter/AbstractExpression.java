package com.designpatterns.pattern.interpreter;

/**
 * @author tanyun
 * @Description 抽象表达式类 （定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()）
 * @date 2022/3/10 21:53
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
