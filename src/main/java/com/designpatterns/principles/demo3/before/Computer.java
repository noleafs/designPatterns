package com.designpatterns.principles.demo3.before;

/**
 * @author tanyun
 * @Description 计算机， 组合所有零件
 * @date 2021/11/22 22:22
 */
public class Computer {

    /**
     * 硬盘
     */
    private XiJieHardDisk hardDisk;
    /**
     * cpu
     */
    private IntelCpu cpu;
    /**
     * 内存条
     */
    private KingstonMemory memory;

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("运行计算机");
        System.out.println("从硬盘上获取的数据是： " + hardDisk.get());
        cpu.run();
        memory.save();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hardDisk=" + hardDisk +
                ", cpu=" + cpu +
                ", memory=" + memory +
                '}';
    }

}
