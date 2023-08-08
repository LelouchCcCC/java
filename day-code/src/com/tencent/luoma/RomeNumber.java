package com.tencent.luoma;

import java.util.Scanner;

public class RomeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.next();
        if (JudgeString(str)){
            System.out.println(ChangeString(str));
        }
    }

    public static boolean JudgeString(String str) {
        if (str.length() > 9) {
            System.out.println("long!");
            return false;
        };
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>'9' || str.charAt(i)<'0'){
                System.out.println("number!");
                return false;
            }
        }
        return true;
    }

    public static String ChangeString(String str){
        String[] arr = {" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String c = arr[str.charAt(i)-'0'];
            sb.append(c);
        }
        return sb.toString();
    }
}
