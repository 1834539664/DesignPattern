package com.wh_1215.pattern.observer;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/1 22:03
 */
public class Client {
    public static void main(String[] args) {
        //1.创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();

        //2.订阅公众号
        subject.attach(new WeiXinUser("孙悟空"));
        subject.attach(new WeiXinUser("悟能"));
        subject.attach(new WeiXinUser("沙悟净"));

        //3.公众号更新,发出消息给订阅者
        subject.notify("WH...更新了最新的消息");
    }
}
