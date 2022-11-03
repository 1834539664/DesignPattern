package com.wh.dao.Impl;

import com.wh.dao.UserDao;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 15:40
 */
public class UserDaoImpl implements UserDao {
    private String userName;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDaoImpl() {
        System.out.println("userDao 被创建了");
    }

    @Override
    public void add() {
        System.out.println("UserDao..." + userName + "===" + password);
    }
}
