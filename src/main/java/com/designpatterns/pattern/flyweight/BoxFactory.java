package com.designpatterns.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tanyun
 * @Description 工厂类，设置为单例
 * @date 2022/2/14 20:32
 */
public class BoxFactory {

    /**
     * 享元池
     */
    private Map<String, AbstractBox> map;

    /**
     * 在构造方法中进行初始化操作
     */
    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    private static BoxFactory factory = new BoxFactory();

    public static BoxFactory getInstance() {
        return factory;
    }

    /**
     * 根据名称获取图形对象
     */
    public AbstractBox getShape(String shape) {
        return map.get(shape);
    }




}
