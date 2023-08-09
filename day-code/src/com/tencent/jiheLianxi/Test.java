package com.tencent.jiheLianxi;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("cxp",18);
        Student s2 = new Student("zyh",22);
        Student s3 = new Student("llm",29);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getAge();
        }
    }
}
