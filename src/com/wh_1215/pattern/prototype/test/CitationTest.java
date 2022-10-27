package com.wh_1215.pattern.prototype.test;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 16:10
 * 测试浅克隆,克隆对象和被克隆的对象的属性持有同一个对象
 * 浅克隆:新对象的属性和原来的对象完全相同
 * 深克隆:属性中引用的其他对象也会被克隆,不再指向原有对象的地址
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1.创建原型对象
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        Citation clone = citation.clone();
        clone.getStudent().setName("李四");
        //citation.setName("张三");
        //clone.setName("李四");
        citation.show();//李四同学,在2022学年第一学期表现优秀,被评为三好学生。特此判罚。
        clone.show(); //李四同学,在2022学年第一学期表现优秀,被评为三好学生。特此判罚。
    }
}
