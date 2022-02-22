package com.designpatterns.pattern.state.after;

/**
 * @author tanyun
 * @Description 抽象状态类
 * @date 2022/2/21 20:52
 */
public abstract class LiftState {

    /**
     * 环境角色
     */
    protected Context context;
    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 电梯开启操作 等
     */
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();

}
