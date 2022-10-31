package com.wh_1215.pattern.command;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/31 22:22
 */
public class LightOnCommand implements Command {
    //聚合LightReceiver
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.on();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        light.off();
    }
}
