package com.tencent.staticdemo1;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        Student st1 = new Student("zhangyu",79,"nan");
        Student st2 = new Student("zhangyu2",54,"nv");
        Student st3 = new Student("zhangyu3",14,"nan");
        student.add(st1);
        student.add(st2);
        student.add(st3);
        System.out.println(StudentUtil.getMaxAge(student));
    }
}
