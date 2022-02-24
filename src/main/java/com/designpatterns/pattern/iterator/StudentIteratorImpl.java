package com.designpatterns.pattern.iterator;

import java.util.List;

/**
 * @author tanyun
 * @Description 具体迭代器角色类
 * @date 2022/2/23 20:32
 */
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    /**
     * 记录当前遍历到的位置
     */
    private int position = 0;

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        // 从集合中获取指定位置的元素
        Student student = list.get(position);
        position++;
        return student;
    }
}
