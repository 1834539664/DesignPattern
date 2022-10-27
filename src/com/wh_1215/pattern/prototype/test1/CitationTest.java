package com.wh_1215.pattern.prototype.test1;

import java.io.*;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 16:10
 * 测试深克隆
 * 浅克隆:新对象的属性和原来的对象完全相同
 * 深克隆:属性中引用的其他对象也会被克隆,不再指向原有对象的地址
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        //1.创建原型对象
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\TestData\\a.txt"));
        oos.writeObject(citation);
        oos.close();

        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\TestData\\a.txt"));
        //读取对象
        Citation clone = (Citation) ois.readObject();
        ois.close();

        Student student1 = clone.getStudent();
        student1.setName("李四");

        citation.show();
        clone.show();


    }
}
