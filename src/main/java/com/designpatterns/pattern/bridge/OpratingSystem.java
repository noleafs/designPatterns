package com.designpatterns.pattern.bridge;

/**
 * @author tanyun
 * @Description 抽象的操作系统类（抽象化角色）
 * @date 2022/2/10 20:01
 */
public abstract class OpratingSystem {

    /**
     * 声明videoFile变量，需要聚合实现化角色
     */
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);

}
