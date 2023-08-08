package com.tencent.stringConnet;
import java.util.Scanner;
public class StringConnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            str2 += c;
        }
        System.out.println(str2);
        System.out.println(str.substring(3,6));
    }
}
