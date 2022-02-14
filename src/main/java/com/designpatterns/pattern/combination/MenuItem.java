package com.designpatterns.pattern.combination;

import com.designpatterns.pattern.combination.MenuComponent;

/**
 * @author tanyun
 * @Description 菜单项类： 属于叶子节点
 * @date 2022/2/11 21:13
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        // 打印菜单项
        System.out.println(name);
    }
}
