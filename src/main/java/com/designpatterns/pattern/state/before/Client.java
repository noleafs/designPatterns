package com.designpatterns.pattern.state.before;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description
 * @date 2022/2/21 20:16
 */
public class Client {

    @Test
    void testState() {
        Lift lift = new Lift();
        lift.setState(ILift.CLOSING_STATE);

        // 开门
        lift.open();
        // 关门
        lift.close();
        // 关门
        lift.close();
    }
}
