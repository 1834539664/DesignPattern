package com.wh_1215.principle.demo5;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/25 21:24
 * 经纪人类
 */
public class Agent {
    private Star star;

    private Fans fans;

    private Company company;

    //和粉丝见面的方法
    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fans.getName());
    }
    //和媒体公司洽谈
    public void business(){
        System.out.println(star.getName()+"和"+company.getName()+"洽谈");
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
