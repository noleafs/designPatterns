package com.designpatterns.pattern.prototype.test1;

import java.io.Serializable;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/17 20:51
 */
public class Student implements Serializable {

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
