package com.wh_1215.pattern.factory.config_factory;

import java.util.HashMap;
import java.util.Properties;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 15:02
 * 咖啡工厂
 */
public class CoffeeFactory {
    //加载配置文件,获取配置文件中的全类名,并创建该类的对象进行存储
    //1.定义容器对象存储咖啡对象
    private static HashMap<String,Coffee> map = new HashMap<>();
    //2.加载配置文件,只需要加载依次
    static {
        //2.1创建Properties对象
        Properties properties = new Properties();
        properties.load();
    }
    public static Coffee createCoffee(String name){

        return null;
    }
}
