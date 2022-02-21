package com.designpatterns.pattern.responsibility;

/**
 * @author tanyun
 * @Description 抽象处理者
 * @date 2022/2/18 19:42
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    /**
     * 该领导处理的请假天数区间
     */
    private int numStart;
    private int numEnd;


    /**
     * 声明后继者 （）
     */
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 处理
     */
    protected abstract void handleLeave(LeaveRequest leaveRequest);


    /**
     * 提交
     */
    public final void submit(LeaveRequest leave) {

        // 当前人没职责处理，调用下一级
        if (this.nextHandler != null && leave.getNum() > numEnd) {
            // 提交给上级
            this.nextHandler.submit(leave);
        } else if (leave.getNum() <= numEnd){
            // 进行处理
            handleLeave(leave);
            System.out.println("流程结束");
        } else {
            System.out.println("不予批准");
        }
    }
}
