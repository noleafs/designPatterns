package com.designpatterns.pattern.combination;

import org.junit.jupiter.api.Test;

/**
 * 组合模式
 * @author tanyun
 * @Description
 * @date 2022/2/11 21:16
 */
public class Client {

    @Test
    void testCombination() {
        // 创建菜单树
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问",3));
        menu1.add(new MenuItem("展开菜单",3));
        menu1.add(new MenuItem("编辑菜单",3));
        menu1.add(new MenuItem("删除菜单",3));
        menu1.add(new MenuItem("新增菜单",3));

        MenuComponent menu2 = new Menu("权限管理", 2);
        menu2.add(new MenuItem("页面访问",3));
        menu2.add(new MenuItem("提交保存",3));

        MenuComponent menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问",3));
        menu3.add(new MenuItem("新增角色",3));
        menu3.add(new MenuItem("修改角色",3));

        // 创建一级菜单
        MenuComponent rootMenu = new Menu("系统管理", 1);
        rootMenu.add(menu1);
        rootMenu.add(menu2);
        rootMenu.add(menu3);

//        MenuComponent child = rootMenu.getChild(0);
//        child.print();
        rootMenu.print();
    }
}
