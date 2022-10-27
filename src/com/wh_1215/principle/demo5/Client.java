package com.wh_1215.principle.demo5;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/25 21:28
 */
public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent();
        //创建明星对象
        Star star = new Star("林青霞");
        agent.setStar(star);
        //创建粉丝对象
        Fans fans = new Fans("李四");
        agent.setFans(fans);
        //创建媒体公司对象
        Company company = new Company("黑马媒体公司");
        agent.setCompany(company);
        //和粉丝见面
        agent.meeting();
        //和媒体公司洽谈
        agent.business();
    }
}
