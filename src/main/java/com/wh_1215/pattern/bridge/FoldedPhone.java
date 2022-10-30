package com.wh_1215.pattern.bridge;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/30 21:00
 * 折叠手机类,继承Phone类
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠样式手机");
    }

    public void close(){
        super.close();
        System.out.println("折叠样式手机");
    }

    public void call(){
        super.call();
        System.out.println("折叠样式手机");
    }
}
