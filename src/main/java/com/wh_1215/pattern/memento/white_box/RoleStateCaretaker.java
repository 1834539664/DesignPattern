package com.wh_1215.pattern.memento.white_box;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 23:23
 * 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    //声明备忘录类型
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
