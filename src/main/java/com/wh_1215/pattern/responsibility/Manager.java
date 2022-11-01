package com.wh_1215.pattern.responsibility;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/1 9:07
 * 部门经理类
 */
public class Manager extends Handler{
    public Manager(){
        super(Handler.NUM_ONE,Handler.NUM_THREE);
    }
    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getName()+"天,"+leave.getContent());
        System.out.println("部门经理审批:同意");
    }
}
