package com.designpatterns.pattern.responsibility;

/**
 * @author tanyun
 * @Description 小组长（具体的处理者）
 * @date 2022/2/18 20:01
 */
public class GroupLeader extends Handler {


    public GroupLeader() {
        // 可以处理 0 到 1天的请假
        super(0, Handler.NUM_ONE);
    }

    /**
     * 处理方法
     * @param leaveRequest
     */
    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println("组长批准 " + leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天, " + leaveRequest.getContent());
    }
}
