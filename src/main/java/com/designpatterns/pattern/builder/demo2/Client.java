package com.designpatterns.pattern.builder.demo2;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description 测试建造者模式的另外一种常见用法
 * @date 2021/12/19 15:15
 */
public class Client {

    @Test
    void phoneBuilderTest() {
        // 通过构建则对象获取手机对象
        Phone xmpPhone = new Phone.Builder()
                .cpu("骁龙")
                .screent("三星屏幕")
                .build();
        System.out.println(xmpPhone);
    }
}
