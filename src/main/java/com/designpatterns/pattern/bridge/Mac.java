package com.designpatterns.pattern.bridge;

/**
 * @author tanyun
 * @Description 扩展抽象化角色（mac操作系统）
 * @date 2022/2/10 20:09
 */
public class Mac extends OpratingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.print("mac电脑播放");
        videoFile.decode(fileName);
    }
}
