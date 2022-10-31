package com.wh_1215.pattern.command;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/31 22:21
 * 创建命令接口
 */
public interface Command {

    //执行动作(操作)
    void execute();

    //撤销动作(操作)
    void undo();
}
