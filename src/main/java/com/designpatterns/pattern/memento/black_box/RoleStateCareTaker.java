package com.designpatterns.pattern.memento.black_box;

import com.designpatterns.pattern.memento.write_box.RoleStateMemento;

/**
 * @author tanyun
 * @Description 备忘录对象管理对象
 * @date 2022/3/9 20:39
 */
public class RoleStateCareTaker {

    /**
     * 声明Memento类型的变量
     */
    private Memento memento;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
