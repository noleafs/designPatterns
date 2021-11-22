package com.designpatterns.principles.demo3.before;

/**
 * @author tanyun
 * @Description
 * @date 2021/11/22 22:34
 */
public class ComputerDemo {

    public static void main(String[] args) {
        // 构建零件
        IntelCpu intelCpu = new IntelCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        // 构建计算机
        Computer computer = new Computer();
        // 组合零部件
        computer.setCpu(intelCpu);
        computer.setMemory(kingstonMemory);
        computer.setHardDisk(xiJieHardDisk);
        // 运行计算机
        computer.run();
    }


}
