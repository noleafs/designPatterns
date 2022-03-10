package com.designpatterns.pattern.memento.black_box;

import com.designpatterns.pattern.memento.write_box.GameRole;
import com.designpatterns.pattern.memento.write_box.RoleStateCareTaker;
import org.junit.jupiter.api.Test;

/**
 * 黑箱备忘录模式
 * @author tanyun
 * @Description
 * @date 2022/3/9 20:52
 */
public class Client {

    @Test
    void testWriteBox() {
        System.out.println("==============大战boss前============");
        // 创建游戏角色对象
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        // 保存状态
        // 创建管理者对象
        RoleStateCareTaker roleStateCareTaker = new RoleStateCareTaker();
        roleStateCareTaker.setRoleStateMemento(gameRole.saveState());


        System.out.println("==============大战boss后============");
        // 开始大战
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("==============恢复状态============");
        gameRole.recoverState(roleStateCareTaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
