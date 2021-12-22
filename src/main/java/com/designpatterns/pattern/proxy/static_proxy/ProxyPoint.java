package com.designpatterns.pattern.proxy.static_proxy;

/**
 * @author tanyun
 * @Description 代理对象
 * @date 2021/12/20 20:17
 */
public class ProxyPoint implements SellTickets{

    /**
     * 目标对象
     */
    private SellTickets sellTickets;

    public ProxyPoint(SellTickets sellTickets) {
        this.sellTickets = sellTickets;
    }

    @Override
    public void sell() {
        System.out.println("代理收取费用");
        sellTickets.sell();
    }
}
