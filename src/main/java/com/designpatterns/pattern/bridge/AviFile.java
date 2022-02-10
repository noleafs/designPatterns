package com.designpatterns.pattern.bridge;

/**
 * @author tanyun
 * @Description avi视频文件（具体的实现化角色）
 * @date 2022/2/10 19:56
 */
public class AviFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件: " + fileName);
    }
}
