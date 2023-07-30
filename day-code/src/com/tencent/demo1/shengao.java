package com.tencent.demo1;

import java.util.Scanner;

public class shengao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("输入三个整数");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int d = a > b ? a : b;
        System.out.println(d > c ? d : c);
    }
}
