package com.designpatterns.pattern.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author tanyun
 * @Description 配置文件 解除工厂和产品的耦合
 * @date 2021/12/13 19:58
 */
public class CoffeeFactory {
    /**
     * 加载配置文件中的全路径通过反射得到对象，存储在此map中
     */
    private static Map<String, Coffee> map = new HashMap<>();

    static {
        Properties properties = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            // 加载配置文件
            properties.load(is);
            for (Object key : properties.keySet()) {
                // 获取prop配置文件中的值
                String className = (String) properties.get(key);
                Class aClass = Class.forName(className);
                Coffee coffee = (Coffee) aClass.getConstructor().newInstance();
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name) {
       return map.get(name);
    }

}
