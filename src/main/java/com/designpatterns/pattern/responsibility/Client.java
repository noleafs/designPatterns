package com.designpatterns.pattern.responsibility;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2022/2/18 20:10
 */
public class Client {

    @Test
    void testResponsibility() {
        // 创建一个请假条对象
        LeaveRequest leaveRequest = new LeaveRequest("小明", 5, "病假");
        // 创建领导·
        GeneralManagerLeader generalManagerLeader = new GeneralManagerLeader();
        ManagerLeader managerLeader = new ManagerLeader();
        GroupLeader groupLeader = new GroupLeader();
        // 设置处理者链
        managerLeader.setNextHandler(generalManagerLeader);
        groupLeader.setNextHandler(managerLeader);

        // 提交请假申请
        groupLeader.submit(leaveRequest);
    }

}
