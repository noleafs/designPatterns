package com.designpatterns.pattern.bridge;

import org.junit.jupiter.api.Test;

/**
 * @author tanyun
 * @Description 桥接模式
 * @date 2022/2/10 20:10
 */
public class Client {

    @Test
    void testBridge() {
        RmvbFile rmvbFile = new RmvbFile();
        OpratingSystem mac = new Mac(rmvbFile);
        // 使用操作系统播放视频文件
        mac.play("花园宝宝");
        AviFile aviFile = new AviFile();
        mac = new Mac(aviFile);
        mac.play("燕双鹰");

    }
}
