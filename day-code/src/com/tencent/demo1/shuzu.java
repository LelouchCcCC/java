package com.tencent.demo1;
import java.util.Random;
public class shuzu {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] brr = {2, 3, 4, 5};
        String[] ao = {"fce", "fe", "fe"};
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        int[] arr2 = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr2.length; i++) {
            int num = r.nextInt(10,20);
            arr2[i] = num;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
