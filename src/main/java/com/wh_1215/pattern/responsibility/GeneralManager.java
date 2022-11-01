package com.wh_1215.pattern.responsibility;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/1 9:07
 * 总经理类
 */
public class GeneralManager extends Handler{
    public GeneralManager(){
        super(Handler.NUM_THREE,Handler.NUM_SEVEN);
    }
    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getName()+"天,"+leave.getContent());
        System.out.println("总经理审批:同意");
    }
}
