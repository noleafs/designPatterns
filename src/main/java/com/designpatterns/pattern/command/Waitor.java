package com.designpatterns.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanyun
 * @Description 服务员类 （属于请求者角色）
 * @date 2022/2/16 20:55
 */
public class Waitor {

    /**
     * 持有多个命令对象
     */
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
       commands.add(command);
    }

    /**
     * 发起命令的功能
     */
    public void orderUp() {
        System.out.println("服务员说：新订单来了");
        for (Command command : commands) {
            command.execute();
        }
    }

}
