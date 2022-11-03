package com.wh.controller;


import com.wh.framework.context.support.ClassPathXmlApplicationContext;
import com.wh.service.UserService;


/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 15:42
 */
public class UserController {
    public static void main(String[] args) throws Exception {
        //创建spring的容器对象
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

        //从容器对象中获取userService对象
        UserService userService =applicationContext.getBean("userService",UserService.class);
        //调用userService进行业务处理
        userService.add();
    }
}
