package com.tencent.itera;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Iter {
    public static void main(String[] args) {
        Collection<String > col = new ArrayList<String >();
        col.add("jon");
        col.add("jon12");
        col.add("joe3n");
        col.add("jo32n");
        col.add("jo43n");
        col.add("j3on");
        col.add("jor455n");
//        for (String s:col){
//            System.out.println(s);
//        }
        col.forEach(s-> System.out.println(s));
    }
}
