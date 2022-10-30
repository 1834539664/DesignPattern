package com.wh_1215.pattern.proxy.jdk_proxy;

import com.wh_1215.pattern.proxy.staic_proxy.ProxyPoint;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 22:11
 * 获取代理对象的工场类
 */
public class ProxyFactory {
    //声明目标对象
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){
        //返回代理对象即可
       SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
               station.getClass().getClassLoader(), station.getClass().getInterfaces(), new InvocationHandler() {
                   @Override
                   /**
                    * proxy : 代理对象,和proxyObject是用一个对象,在invoke方法中基本不用
                    * method : 对接口中的方法进行封装的method对象
                    * args: 调用方法的实际参数
                    * 返回值:方法的返回值
                    */
                   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       //System.out.println("invoke方法执行了");
                        //执行目标对象的方法
                       System.out.println("代售点收取一定的服务费用(jdk动态代理)");
                       Object obj = method.invoke(station, args);
                       return obj;
                   }
               });
       /*
       ClassLoader loader,类加载器,用于加载代理类,可以通过目标对象获取类加载器
       Class<?>[] interfaces,代理类实现的接口的字节码对象
       InvocationHandler h 代理对象的调用处理程序
        */
       return proxyObject;
    }
}
