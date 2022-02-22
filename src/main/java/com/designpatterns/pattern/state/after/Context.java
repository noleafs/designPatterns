package com.designpatterns.pattern.state.after;

/**
 * @author tanyun
 * @Description 环境角色类
 * @date 2022/2/21 20:53
 */
public class Context {

    /**
     * 定义对应状态对象的常量
     */
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static StoppingState STOPPING_STATE = new StoppingState();
    public final static ClosingState CLOSING_STATE = new ClosingState();


    /**
     * 定义一个当前电梯状态变量
     */
    private LiftState liftState;


    public LiftState getLiftState() {
        return liftState;
    }

    /**
     * 设置当前电梯状态
     * @param liftState
     */
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        // 设置当前状态对象中的Context对象
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }


}
