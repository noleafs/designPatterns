package com.designpatterns.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanyun
 * @Description 聚合角色（容器）
 * @date 2022/2/23 20:51
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    /**
     * 获取迭代器对象
     * @return
     */
    @Override
    public StudentIterator getStudentIterator() {
        StudentIteratorImpl studentIterator = new StudentIteratorImpl(this.list);
        return studentIterator;
    }

}
