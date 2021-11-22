package com.designpatterns.principles.demo3.after;

/**
 * @author tanyun
 * @Description
 * @date 2021/11/22 22:49
 */
public class Computer {
    private Cpu cpu;
    private HardDisk hardDisk;
    private Memory memory;


    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("运行计算机");
        System.out.println(hardDisk.get());
        cpu.run();
        memory.save();
    }

}
