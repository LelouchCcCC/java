package com.tencent.staticdemo1;
import java.util.ArrayList;
public class StudentUtil {
    private StudentUtil(){}
    public static int getMaxAge(ArrayList<Student> list){
        int maxAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            Student st = list.get(i);
            int age = st.getAge();
            maxAge = maxAge> age ?maxAge: age;
        }
        return maxAge;
    }
}
