package com.tencent.xitike;

import java.lang.reflect.Type;
import java.util.Random;

public class yanzhengma {
    public static void main(String[] args) {
        System.out.println(Roll());
    }

    public static String Roll() {
        Random rm = new Random();
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i < 26) {
                char k = (char) (i + 97);
                arr[i] = k;
            } else {
                char k = (char) (i - 26 + 65);
                arr[i] = k;
            }
        }
        String str = "";
        for (int i = 0; i < 4; i++) {
            int n = rm.nextInt(arr.length);
            str += arr[n];
        }
        str+=rm.nextInt(10);
        return str;
    }
}
