package com.tencent.demo1;
import java.util.Random;
public class suoyin {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
