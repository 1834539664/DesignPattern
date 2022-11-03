package com.wh.framework.context;

import com.wh.framework.beans.factory.BeanFactory;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 22:35
 * 定义非延时加载功能
 */
public interface ApplicationContext extends BeanFactory {

    void refresh() throws Exception;
}
