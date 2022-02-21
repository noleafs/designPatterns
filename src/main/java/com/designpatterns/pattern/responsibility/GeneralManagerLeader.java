package com.designpatterns.pattern.responsibility;

/**
 * @author tanyun
 * @Description 总经理（具体的处理者）
 * @date 2022/2/18 20:01
 */
public class GeneralManagerLeader extends Handler {


    public GeneralManagerLeader() {
        // 可以处理 0 到 1天的请假
        super( Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    /**
     * 处理方法
     * @param leaveRequest
     */
    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println("总经理批准 " + leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天, " + leaveRequest.getContent());
    }
}
