package com.wh_1215.pattern.responsibility;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/1 9:07
 * 小组长类
 */
public class GroupLeader extends Handler{
    public GroupLeader(){
        super(0,Handler.NUM_ONE);
    }
    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getName()+"天,"+leave.getContent());
        System.out.println("小组长审批:同意");
    }
}
