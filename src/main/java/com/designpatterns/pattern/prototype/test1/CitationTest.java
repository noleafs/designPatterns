package com.designpatterns.pattern.prototype.test1;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author tanyun
 * @Description 测试原型模式
 * @date 2021/12/17 20:20
 */
public class CitationTest {

    private static final String FILE_PATH = "E:\\java chucun\\design-patterns\\src\\main\\java\\com\\designpatterns\\pattern\\prototype\\test1\\objectCopy.txt";

    @Test
    void testObjectCopy() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        // 创建原型对象
        Citation citation = new Citation();
        citation.setStudent(new Student("小明"));
        // 通过序列化来深拷贝
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        // 写对象
        oos.writeObject(citation);
        oos.close();

        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Citation citationCopy = (Citation) ois.readObject();
        citationCopy.getStudent().setName("小黄");
        ois.close();

        citation.show();
        citationCopy.show();
    }
}
