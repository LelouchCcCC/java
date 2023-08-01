package com.tencent.demo2;

public class leizuida {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,3,10,5};
        int a = findMax(arr);
        System.out.println(a);
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max:arr[i];
        }
        return max;
    }
}
