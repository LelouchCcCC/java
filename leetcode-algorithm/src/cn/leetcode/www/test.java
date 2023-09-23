package cn.leetcode.www;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        a15 te = new a15();
        int[] arr = {-2, 0, 0, 2, 2};
        System.out.println(te.threeSum(arr));
        System.out.println(52.523 == 5.2523e+1);
        System.out.println(52.523 == 0.52523e+2);
        System.out.println(52.523 == 525.23e-1);
        System.out.println(52.523 == 52.523e+0);
        System.out.println(5_2);
        System.out.println(5_2534e+1);
        double a = 6.5;
        System.out.println(a += a + 1);
        int x = 0;
        System.out.println(x += 4.5);
        System.out.println((int) (4.5));
        System.out.printf("%.2f%n", 3.154);
        double amount = 5;
        System.out.println(amount / 2);
        Random rd = new Random();
        double d = rd.nextDouble();
        System.out.println(d);
        System.out.println((int) (d + 0.5));
        int b = 1;
        int day = 2;
        switch (day) {
            case 1:
            case 2:
            case 3:
                System.out.println("33");
            case 4:
            case 5:
                System.out.println("???");
                break;
            case 6:
            case 7:
                System.out.println("---");
                break;
        }
        char c = 'a';
        System.out.println(++c);
        System.out.println("cnomdv\"ckn\\t\tcmnkr");
        char sh = (char) 65.25;
        System.out.println(sh);
        byte bb = 127;
        byte aaa = (byte) '\uFFF4';
        System.out.println(aaa);
        String s1 = " vnif e SMc ef ";
        String s2 = "mifr";
        System.out.println(s1.concat(s2));
        System.out.println(s1.trim());
        System.out.println(max(1, 2));

        char ranChar = (char) ('a' + Math.random() * ('z' - 'a' + 1));
        System.out.println(ranChar);
        int[] ok = new int[5];
        ok[0] = 1;
        ok[0] = 2;

        int[] list = {1, 2, 3, 4, 5};
        reverse(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");


        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 7, 7, 10};
        System.out.println(java.util.Arrays.toString(list1));
        System.out.println(java.util.Arrays.toString(list2));
        java.util.Arrays.fill(list1, 5); // Fill 5 to the whole array
        java.util.Arrays.fill(list2, 1, 5, 8);
        System.out.println(java.util.Arrays.toString(list1));
        System.out.println(java.util.Arrays.toString(list2));

    }

    public static void reverse(int[] list) {
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[list.length-1-i];
        }
        list = newList;
    }

    public static float max(float a, float b) {
        return a > b ? a : b;
    }


}
