package com.designpatterns.principles.demo1;

/**
 * 开闭原则：
 *      对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。
 *      简言之，是为了使程序的扩展性好，易于维护和升级。
 * @author tanyun
 * @Description 测试代码
 * @date 2021/11/21 19:38
 */
public class Client {

    public static void main(String[] args) {
        // 1.创建搜狗输入法对象
        SouGouInput input = new SouGouInput();
        // 2.创建皮肤， 在这里体现了开闭原则，当需要添加新的皮肤时不会修改原有的代码，只需要新建皮肤类设置进去即可
//        DefaultSkin skin = new DefaultSkin();
        CustomSkin skin = new CustomSkin();
        // 3.设置皮肤
        input.setSkin(skin);
        // 4.显示皮肤
        input.display();
    }
}
