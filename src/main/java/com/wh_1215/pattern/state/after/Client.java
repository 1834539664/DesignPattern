package com.wh_1215.pattern.state.after;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/1 17:45
 */
public class Client {
    public static void main(String[] args) {
        //创建环境角色对象
        Context context = new Context();
        //设置当前电梯装填
        context.setLiftState(new StoppingState());
        //context.open();
        context.close();
        context.open();
        context.run();
        context.close();
        context.run();
        context.stop();
    }
}
