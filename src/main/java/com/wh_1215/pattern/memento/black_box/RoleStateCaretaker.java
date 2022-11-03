package com.wh_1215.pattern.memento.black_box;

import com.wh_1215.pattern.memento.white_box.RoleStateMemento;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/2 23:23
 * 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    //声明备忘录类型
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
