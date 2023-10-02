package com.tencent.lambdaDeom1;

import java.util.*;

public class LambdaDemo2 {
    public static void main(String[] args) {
        String[] arr = {"aa", "aaaa","a","aaa"};
        Arrays.sort(arr, (o1,o2)->o1.length()-o2.length());
        System.out.println(Arrays.toString(arr));


        Collection<String> cp = new ArrayList<String >();
        cp.add("irnm");
        cp.add("irnm2");
        cp.add("irnm4");
        cp.add("irnm745o");
        Iterator<String> itor = cp.iterator();
        while (itor.hasNext()){
            String next = itor.next();
            if (next.equals("irnm4")){
                itor.remove();
            }
        }
        cp.forEach(s-> System.out.println(s));
    }
}
