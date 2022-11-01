package com.wh_1215.pattern.state.before;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/1 16:56
 * 电梯接口
 */
public interface ILift {
    //定义四个电梯状态常量
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    //设置电梯状态的功能
    void setState(int state);

    //电梯操作功能
    void open();

    void close();

    void run();

    void stop();
}
