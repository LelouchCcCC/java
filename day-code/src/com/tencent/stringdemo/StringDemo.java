package com.tencent.stringdemo;
import java.util.Scanner;
public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int da = 0;
        int xiao = 0;
        int di = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (48 <= c && c <= 57){
                di+=1;
            } else if (65 <= c && c <= 90) {
                da+=1;
            }else if (97 <= c && c <= 122){
                xiao+=1;
            }
        }
        System.out.println(da);
        System.out.println(xiao);
        System.out.println(di);
    }
}
