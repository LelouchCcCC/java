package com.tencent.xitike;

public class erwei {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        int[] arr1 = {22, 66, 44};
        int[] arr2 = {77, 33, 88};
        int[] arr3 = {25, 45, 65};
        int[] arr4 = {11, 66, 99};
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;
        arr[3] = arr4;
        int[] nn = new int[4];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
            nn[i] = sum;
        }

        int summ = 0;
        for (int i = 0; i < nn.length; i++) {
            System.out.println(nn[i]);
            summ+=nn[i];
        }
        System.out.println(summ);

    }
}
