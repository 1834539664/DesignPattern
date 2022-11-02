package com.wh_1215.pattern.mediator;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 19:54
 */
public class Client {
    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediator = new MediatorStructure();

        //创建租房者对象
        Tenant tenant = new Tenant("李四", mediator);
        HouseOwner houseOwner = new HouseOwner("张三",mediator);

        //中介者要知道具体的房主和租赁者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("我要租三室的房子");
        houseOwner.constact("我这里有三室的房子,你要租吗?");
    }
}
