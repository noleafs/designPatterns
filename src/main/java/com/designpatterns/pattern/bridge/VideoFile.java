package com.designpatterns.pattern.bridge;

/**
 * @author tanyun
 * @Description 视频文件（实现化角色）
 * @date 2022/2/10 19:52
 */
public interface VideoFile {

    /**
     * 解码方法
     * @param fileName
     */
    void decode(String fileName);

}
