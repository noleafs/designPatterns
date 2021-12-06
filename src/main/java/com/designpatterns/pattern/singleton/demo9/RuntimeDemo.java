package com.designpatterns.pattern.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author tanyun
 * @Description
 * @date 2021/12/5 19:30
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        // 获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();
        // 调用runtime的方法exec， 参数要的是一个cmd命令
        Process exec = runtime.exec("ipconfig");
        // 调用Process对象的获取输入流的方法
        InputStream is = exec.getInputStream();
        byte[] bytes = new byte[1024 * 1024 * 100];
        // 返回读到的字节个数
        int len = is.read(bytes);
        // 将字节数组转换为字符串输出到控制台
        System.out.println(new String(bytes,0, len, "GBK"));
    }

}
