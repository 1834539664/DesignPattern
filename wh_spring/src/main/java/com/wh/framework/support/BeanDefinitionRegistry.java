package com.wh.framework.support;

import com.wh.framework.beans.factory.BeanDefinition;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 21:51
 * 注册表对象
 */
public interface BeanDefinitionRegistry {
    //注册BeanDefinition对象到注册表中
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    //从注册表中删除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName) throws Exception;

    //根据名称从注册表中获取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();
}
