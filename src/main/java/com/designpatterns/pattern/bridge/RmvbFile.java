package com.designpatterns.pattern.bridge;

/**
 * @author tanyun
 * @Description 具体的实现化角色
 * @date 2022/2/10 20:00
 */
public class RmvbFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件： " + fileName);
    }
}
