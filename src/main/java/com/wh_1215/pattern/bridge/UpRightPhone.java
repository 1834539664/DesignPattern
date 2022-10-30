package com.wh_1215.pattern.bridge;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 21:10
 */
public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立式手机");
    }

    public void close(){
        super.close();
        System.out.println("直立式手机");
    }

    public void call(){
        super.call();
        System.out.println("直立式手机");
    }
}
