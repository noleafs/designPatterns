package com.designpatterns.pattern.bridge;

/**
 * @author tanyun
 * @Description 扩展抽象化角色（windows操作系统）
 * @date 2022/2/10 20:05
 */
public class Windows extends OpratingSystem {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.print("windows系统播放");
        videoFile.decode(fileName);
    }
}
