package com.designpatterns.principles.demo5;

/**
 * @author tanyun
 * @Description 经纪人类
 * @date 2021/11/25 22:59
 */
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public Agent() {

    }

    public Agent(Star star, Fans fans, Company company) {
        this.star = star;
        this.fans = fans;
        this.company = company;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * 和粉丝见面的方法
     */
    public void meeting() {
        System.out.println(String.format("%s和粉丝%s见面", star.getName(), fans.getName()));
    }

    /**
     * 和媒体洽谈业务
     */
    public void business() {
        System.out.println(String.format("%s和%s洽谈业务", star.getName(), company.getName()));
    }

}
