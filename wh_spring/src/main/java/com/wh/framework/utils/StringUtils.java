package com.wh.framework.utils;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/3 23:18
 */
public class StringUtils {
    private StringUtils(){

    }

    //userDao --> setUserDao
    public static String getSetterMethodByFieldName(String fieldName){
        String methodName ="set"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
        return methodName;
    }
}
