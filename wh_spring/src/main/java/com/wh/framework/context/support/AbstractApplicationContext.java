package com.wh.framework.context.support;

import com.wh.framework.beans.factory.BeanDefinition;
import com.wh.framework.context.ApplicationContext;
import com.wh.framework.support.BeanDefinitionReader;
import com.wh.framework.support.BeanDefinitionRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 22:48
 * ApplicationContext接口的子实现类,用于立即加载
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    //声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;

    //定义用于存储bean对象的map容器
    protected Map<String,Object> singletonObjects = new HashMap<String,Object>();

    //声明配置文件路径的变量
    protected String configLocation;

    public void refresh() throws Exception{
        //加载BeanDefinition对象
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        //初始化bean
        finishBeanInitialization();
    }

    //bean的初始化
    private void finishBeanInitialization() throws Exception{
        //获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        //获取BeanDefinition对象
        String[] beanNames = registry.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            //进行bean的初始化
            getBean(beanName);
        }

    }
}
