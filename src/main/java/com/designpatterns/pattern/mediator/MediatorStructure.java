package com.designpatterns.pattern.mediator;

/**
 * @author tanyun
 * @Description 具体的中介者角色类
 * @date 2022/2/22 21:33
 */
public class MediatorStructure extends Mediator {

    /**
     * 聚合房主和具体的租房者
     */
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if (person instanceof Tenant) {
            houseOwner.getMessage(message);
        } else if(person instanceof HouseOwner) {
            // 如果是房主，则要回复租客
            tenant.getMessage(message);
        }
    }


}
