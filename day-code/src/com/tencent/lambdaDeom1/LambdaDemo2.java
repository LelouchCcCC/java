package com.tencent.lambdaDeom1;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        String[] arr = {"aa", "aaaa","a","aaa"};
        Arrays.sort(arr, (o1,o2)->o1.length()-o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
