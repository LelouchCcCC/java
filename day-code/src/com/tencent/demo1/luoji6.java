package com.tencent.demo1;
import java.util.Scanner;
public class luoji6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入两个数字");
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(i==6 || j==6 || (i+j)%6==0);
    }
}
