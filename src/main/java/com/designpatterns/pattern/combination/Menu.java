package com.designpatterns.pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanyun
 * @Description 菜单类： 属于树枝节点
 * @date 2022/2/11 20:59
 */
public class Menu extends MenuComponent {

    /**
     * 菜单可以有多个子菜单或者子菜单项
     */
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    /**
     *
     * @param name 菜单名
     * @param level 菜单层数
     */
    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    /**
     * 打印菜单名称，如果有子菜单则也需要打印
     */
    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
