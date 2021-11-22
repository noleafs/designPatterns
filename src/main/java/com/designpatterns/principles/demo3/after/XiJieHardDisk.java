package com.designpatterns.principles.demo3.after;

/**
 * @author tanyun
 * @Description 希捷硬盘
 * @date 2021/11/22 22:15
 */
public class XiJieHardDisk implements HardDisk {

    /**
     * 向硬盘中存储数据
     * @param data
     */
    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘存储了： " + data);
    }

    /**
     * 获取硬盘中的数据
     * @return
     */
    @Override
    public String get() {
        System.out.println("获取希捷硬盘中的数据");
        return "数据";
    }

}
