package com.designpatterns.pattern.interpreter;

/**
 * 解释器模式
 * @author tanyun
 * @Description
 * @date 2022/3/10 22:19
 */
public class Client {

    public static void main(String[] args) {
        // 创建环境对象
        Context context = new Context();
        // 创建多个变量对象
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        //将变量存储到环境对象中
        context.assign(a,1);
        context.assign(b,3);
        context.assign(c,5);
        context.assign(d,6);

        // 获取抽象语法树 a + b - c +d
        AbstractExpression expression = new Plus(a, new Plus(new Mins(b, c), d));

        // 计算（解释）
        int interpret = expression.interpret(context);
        System.out.println(interpret);
        System.out.println(expression);

    }
}
