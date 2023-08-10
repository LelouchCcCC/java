package com.tencent.sta;
import java.util.StringJoiner;
public class arrayUtil {
    private arrayUtil() {
    }
    public static String printArr(int[] arr){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(Integer.toString(arr[i]));
        }
        return sj.toString();
    }
}
