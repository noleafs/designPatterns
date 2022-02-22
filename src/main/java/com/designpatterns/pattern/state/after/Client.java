package com.designpatterns.pattern.state.after;

/**
 * 状态模式
 * @author tanyun
 * @Description
 * @date 2022/2/21 22:29
 */
public class Client {

    public static void main(String[] args) {
        // 创建环境角色对象
        Context context = new Context();
        // 创建当前状态
        OpeningState openingState = new OpeningState();
        context.setLiftState(openingState);

        openingState.open();
        openingState.close();
        openingState.run();
    }
}
