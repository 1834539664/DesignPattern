package com.wh_1215.pattern.prototype.test;

/**
 * @author WH
 * @version 1.0
 * @date 2022/10/27 16:06
 */
public class Citation implements Cloneable {
    //三好学生上的姓名
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show(){
        System.out.println(student.getName()+"同学,在2022学年第一学期表现优秀,被评为三好学生。特此颁发。");
    }
}
