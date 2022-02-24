package com.designpatterns.pattern.iterator;

/**
 * @author tanyun
 * @Description 抽象聚合角色接口（就是容器）
 * @date 2022/2/23 20:48
 */
public interface StudentAggregate {

    /**
     * 添加学生功能
     */
    void addStudent(Student student);

    /**
     * 删除学生功能
     */
    void removeStudent(Student student);

    /**
     * 获取迭代器对象功能
     */
    StudentIterator getStudentIterator();


}
