package com.wh_1215.pattern.command;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/31 22:30
 * 遥控器,命令调用者
 */
public class RemoteController {
    //开 按钮的命令数组
    private Command[] onCommands;
    private Command[] offCommands;

    //执行撤销的命令
    private Command undoCommand;

    //构造器.完成对按钮的初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给我们的按钮设置你需要的命令
    public void setCommands(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开按钮
    public void onButtonWasPushed(int no) {
        //找到按下的按钮,并调用对应的方法
        onCommands[no].execute();
        ///记录最后这次的操作,用于撤销
        undoCommand = onCommands[no];
    }

    public void offButtonWasPushed(int no) {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
