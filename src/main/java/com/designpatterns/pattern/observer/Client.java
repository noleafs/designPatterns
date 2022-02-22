package com.designpatterns.pattern.observer;

import org.junit.jupiter.api.Test;

/**
 * 观察者模式
 * @author tanyun
 * @Description
 * @date 2022/2/22 20:10
 */
public class Client {

    @Test
    void testObserver() {
        //创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject() ;

        //订阅公众号（也就是观察者对象）
        subject.attach(new WeiXinUser("A"));
        subject.attach(new WeiXinUser("B"));
        subject.attach(new WeiXinUser("C"));
        subject.attach(new WeiXinUser("D"));
        // 会通知所有订阅公众号的人
        subject.notify("发布了新文章");

    }


}
