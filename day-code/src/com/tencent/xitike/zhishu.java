package com.tencent.xitike;

import java.util.SortedMap;

public class zhishu {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
