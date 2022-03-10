package com.designpatterns.pattern.memento.write_box;

/**
 * @author tanyun
 * @Description 备忘录对象管理对象
 * @date 2022/3/9 20:39
 */
public class RoleStateCareTaker {

    /**
     * 声明RoleStateMemento类型的变量
     */
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
