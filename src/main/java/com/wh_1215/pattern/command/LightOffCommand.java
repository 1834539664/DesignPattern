package com.wh_1215.pattern.command;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/31 22:26
 */
public class LightOffCommand implements Command{

    //聚合LightReceiver
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
