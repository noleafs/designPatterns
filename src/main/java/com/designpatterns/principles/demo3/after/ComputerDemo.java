package com.designpatterns.principles.demo3.after;

/**
 * 依赖倒转原则：
 *      高层模块不应该依赖低层模块，两者都应该依赖其抽象。 要求对抽象进行编程，不要对实现进行编程，面向接口编程
 * @author tanyun
 * @Description 使用依赖倒转原则
 * @date 2021/11/22 22:52
 */
public class ComputerDemo {

    public static void main(String[] args) {
        // 构建零件
        Cpu intelCpu = new IntelCpu();
        Cpu amdCpu = new AmdCpu();
        Memory kingstonMemory = new KingstonMemory();
        HardDisk xiJieHardDisk = new XiJieHardDisk();
        // 构建计算机
        Computer computer = new Computer();
        // 组合零部件
//        computer.setCpu(intelCpu);
        computer.setCpu(amdCpu);
        computer.setMemory(kingstonMemory);
        computer.setHardDisk(xiJieHardDisk);
        // 运行计算机
        computer.run();
    }
}
