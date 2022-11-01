package com.wh_1215.pattern.responsibility;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/1 8:57
 * 请假条类
 */
public class LeaveRequest {
    //请假人姓名
    private String name;
    //请假天数
    private int num;
    //请假内容
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }


}
