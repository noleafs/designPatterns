package com.designpatterns.principles.demo5;

/**
 * 迪米特法则
 * @author tanyun
 * @Description
 * @date 2021/11/25 23:04
 */
public class Client {
    public static void main(String[] args) {
        // 创建经纪人
        Agent agent = new Agent();
        // 明星
        Star star = new Star("彭于晏");
        // 粉丝
        Fans fans = new Fans("小明");
        // 媒体公司
        Company company = new Company("今日头条");
        agent.setCompany(company);
        agent.setFans(fans);
        agent.setStar(star);

        agent.business();
        agent.meeting();

    }
}
