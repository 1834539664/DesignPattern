package com.wh.service.impl;

import com.wh.dao.UserDao;
import com.wh.service.UserService;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 15:41
 * 业务逻辑层实现类
 */
public class UserServiceImpl implements UserService {
    //声明一个UserDao类型的变量
    private UserDao userDao;
    public UserServiceImpl(){
        System.out.println("userService被创建了");
    }
    @Override
    public void add() {
        System.out.println("UserService...");
        userDao.add();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
