package com.designpatterns.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanyun
 * @Description 对象结构类
 * @date 2022/3/8 20:49
 */
public class Home {

    /**
     * 声明一个结合对象，用来存储元素对象
     */
    private List<Animal> nodeList = new ArrayList<>();

    /**
     * 添加元素
     * @param animal
     */
    public void add(Animal animal) {
        nodeList.add(animal);
    }


    public void action(Person person) {
        // 让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }


}
