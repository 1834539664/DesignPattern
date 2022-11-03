package com.wh_1215.pattern.memento.black_box;



/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 23:24
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("==========大战boss前====================");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        //将该游戏角色内部状态备份
        //创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("==========大战boss后====================");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("===========恢复后==========");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}
