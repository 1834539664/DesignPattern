package com.wh_1215.pattern.bridge;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 21:05
 */
public class Client {
    public static void main(String[] args) {
        //获得折叠式手机
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("========================");
        //折叠式的vivo手机
        Phone phone1 = new FoldedPhone(new Vivo());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("===============");
        Phone phone2 = new UpRightPhone(new XiaoMi());
        phone2.open();

        System.out.println("============");
        Phone phone3 = new UpRightPhone(new HuaWei());
        phone3.open();
    }
}
