package com.designpatterns.pattern.prototype.test;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/17 20:51
 */
public class Student  {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
