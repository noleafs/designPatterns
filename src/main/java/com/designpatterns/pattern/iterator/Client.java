package com.designpatterns.pattern.iterator;

import org.junit.jupiter.api.Test;

/**
 * 迭代器模式
 * @author tanyun
 * @Description
 * @date 2022/2/23 20:56
 */
public class Client {

    @Test
    void testIterator() {
        // 创建容器
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("小米","1111"));
        studentAggregate.addStudent(new Student("小黄","2222"));
        studentAggregate.addStudent(new Student("小白","3333"));

        // 获取迭代器
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while(studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }


    }
}
