package com.designpatterns.pattern.prototype.test;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/17 20:20
 */
public class CitationTest {

    @Test
    void testObjectCopy() throws CloneNotSupportedException {
        // 创建原型对象
        Citation citation = new Citation();
        citation.setStudent(new Student("小明"));
        citation.setName("小明");
        // 克隆
        Citation citation1 = citation.clone();
        citation1.setName("小黄");
        citation1.getStudent().setName("小黄");


        citation.show();
        citation1.show();
        System.out.println(citation.getName());
        System.out.println(citation1.getName());

    }
}
