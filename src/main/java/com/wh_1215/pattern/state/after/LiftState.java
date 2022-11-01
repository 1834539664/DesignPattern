package com.wh_1215.pattern.state.after;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/1 17:24
 * 抽象状态类
 */
public abstract class LiftState {

    //声明环境角色类变量
    protected Context context;

    public void setContext(Context context){
        this.context =context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
