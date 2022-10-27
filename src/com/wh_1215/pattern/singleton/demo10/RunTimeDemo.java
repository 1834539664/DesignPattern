package com.wh_1215.pattern.singleton.demo10;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 21:43
 */
public class RunTimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ipconfig");
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        int len = is.read(arr); //返回读到的字节的个数
        //将字节数组转换为字符串输出到控制台
        System.out.println(new String(arr,0,len,"GBK"));
    }
}
