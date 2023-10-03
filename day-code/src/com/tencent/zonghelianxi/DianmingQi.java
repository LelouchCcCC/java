package com.tencent.zonghelianxi;

import com.tencent.staticdemo1.StudentUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class DianmingQi {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr,"A","B","C","D","E","F","G","H");
        Random r = new Random();
        for (int j = 0; j < 2; j++) {
            for (int i=0;i<arr.size();i++){
                int index = r.nextInt(arr.size()-i);
                String luckyMan = arr.get(index);
                System.out.print(luckyMan);
                String temp = arr.get(index);
                arr.set(index,arr.get(arr.size()-i-1));
                arr.set(arr.size()-i-1, temp);
            }
            System.out.println();
        }




//        Collections.shuffle(arr);
//        System.out.println(arr.get(0));
    }
}
