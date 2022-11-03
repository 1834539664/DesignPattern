package com.wh_1215.pattern.memento.white_box;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 23:13
 * 游戏角色类
 */
public class GameRole {
    private int vit;
    private int atk;
    private int def;

    //初始化内部状态
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    //战斗
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    //保存角色状态功能
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    //恢复角色状态功能
    public void recoverState(RoleStateMemento roleStateMemento) {
        //将备忘录对象中存储的状态赋值给当前对象的成员
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }
    //展示内部状态
    public void stateDisplay(){
        System.out.println("角色生命力:"+vit);
        System.out.println("角色攻击力:"+atk);
        System.out.println("角色防御力:"+def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
