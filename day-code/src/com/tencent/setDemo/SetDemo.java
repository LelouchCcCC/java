package com.tencent.setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
//        Set<String> st = new HashSet<>();
//        st.add("ni");
//        st.add("kodmfje");
//        Iterator<String> itor = st.iterator();
//        while (itor.hasNext()){
//            System.out.println(itor.next());
//        }
//        st.forEach(s-> System.out.println(s));
        Student s1 = new Student(12,"inke");
        Student s2 = new Student(13,"inrfvge");
        Student s3 = new Student(12,"inke");

        HashSet<Student> se = new HashSet<>();
        se.add(s1);
        se.add(s2);
        se.add(s3);
        se.forEach(s-> System.out.println(s));
    }
}
