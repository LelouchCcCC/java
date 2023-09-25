package com.tencent.sta;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,4,7,30,27,8};
        System.out.println(arr[0]);
        System.out.println(arrayUtil.printArr(arr));
        long a=10;
        int b=10;
        System.out.println(a==b);
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
    }
}
