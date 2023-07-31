package com.tencent.demo1;

import java.util.Scanner;

public class switch_lianxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1-4");
        int x = sc.nextInt();
        switch (x) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出");
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

    }
}
