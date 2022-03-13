package com.designpatterns.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tanyun
 * @Description 环境角色类 （通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。）
 * @date 2022/3/10 21:55
 */
public class Context {

    /**
     * 定义一个map集合， 用来存储变量及对应的值
     */
    private Map<Variable, Integer>  map = new HashMap<>();

    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    /**
     * 根据变量获取对应的值
     * @param var
     * @return
     */
    public int getValue(Variable var) {
        return map.get(var);
    }

}
