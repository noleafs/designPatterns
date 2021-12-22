package com.designpatterns.pattern.prototype.test;

/**
 * @author tanyun
 * @Description 奖状
 * @date 2021/12/17 20:18
 */
public class Citation implements Cloneable {

    private String name;

    private Student student;

    public void show() {
        System.out.println(String.format("%s同学： 在2021年第一学期中表现优秀，被评为三好学生。特发此状！", student.getName()));
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Citation{" +
                "name='" + name + '\'' +
                '}';
    }
}
