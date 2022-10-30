package com.wh_1215.pattern.proxy.cglib_proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/28 18:50
 * 代理对象工厂,用来获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation station = new TrainStation();
    /**
     *
     * @return 返回值是TrainStation的子类
     */
    public TrainStation getProxyObject(){
        //创建Enhancer对象,类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject =(TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取一定费用,cglib代理");
        //调用目标对象的方法
        //声明火车站对象
        Object obj = method.invoke(station, objects);
        return obj;
    }
}
