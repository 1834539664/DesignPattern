package com.wh_1215.pattern.command;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/31 22:40
 */
public class Client {
    public static void main(String[] args) {
        //创建接收者
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        //电灯关闭的命令
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //创建遥控器
        RemoteController remoteController = new RemoteController();
        //给遥控器设置命令
        remoteController.setCommands(0,lightOnCommand,lightOffCommand);
        //测试遥控器按钮
        remoteController.onButtonWasPushed(0);
        remoteController.undoButtonWasPushed();
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();

    }
}
