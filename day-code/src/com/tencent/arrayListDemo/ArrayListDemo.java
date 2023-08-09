package com.tencent.arrayListDemo;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        list.remove("bbb");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
