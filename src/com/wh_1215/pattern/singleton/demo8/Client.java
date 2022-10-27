package com.wh_1215.pattern.singleton.demo8;


import java.io.*;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/26 19:29
 * 演示序列化破坏单例模式,以及其解决方案
 */
public class Client {
    public static void main(String[] args) throws Exception {
        writeObjectToFile();
        readObject();
        readObject();
    }

    //从文件读取数据(对象)
    public static void readObject() throws Exception {
        ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("D:\\TestData\\a.txt"));
        Singleton instance = (Singleton) ois.readObject();
        ois.close();
        System.out.println(instance);
    }
    //向文件中写数据(对象)
    public static void writeObjectToFile() throws  Exception{
        //1.获取对象
        Singleton instance = Singleton.getInstance();
        //2.创建对象输出流对象
        ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("D:\\TestData\\a.txt"));
        //3.写对象
        oos.writeObject(instance);
        oos.close();
    }


}
