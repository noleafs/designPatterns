package com.designpatterns.pattern.mediator;

import org.junit.jupiter.api.Test;

/**
 * 中介者模式
 * @author tanyun
 * @Description
 * @date 2022/2/22 21:41
 */
public class Client {
    @Test
    void testMediator() {

        // 创建中介者对象
        MediatorStructure mediatorStructure = new MediatorStructure();
        // 创建房主和租客
        Tenant tenant = new Tenant("小明", mediatorStructure);
        HouseOwner houseOwner = new HouseOwner("周董", mediatorStructure);

        // 中介者需要知道具体的房主和租房者
        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);

        // 沟通
        tenant.constact("我要租房");
        // 房主回复
        houseOwner.constact("好的");


    }


}
