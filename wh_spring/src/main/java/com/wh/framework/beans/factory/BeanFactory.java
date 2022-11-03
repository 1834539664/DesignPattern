package com.wh.framework.beans.factory;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 22:30
 * IOC容器父接口
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;

    <T> T getBean(String name,Class<? extends T> clazz) throws Exception;
}
