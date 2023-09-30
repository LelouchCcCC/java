package com.tencent.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (tot(arr)<200){
            Scanner sc = new Scanner(System.in);
            System.out.println("input: ");
            String line = sc.next();
            arr.add(Integer.parseInt(line));
        }
        System.out.println(arr.toString());
        int[] arr1={1,2,3,4};
        int[] arr2= Arrays.copyOf(arr1,6);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
    }
    private static int tot(ArrayList<Integer> arr){
        int sum=0;
        for (Integer i :arr){
            sum+=i;
        }
        return sum;
    }
    private static void show(ArrayList<Integer> arr){
        for (Integer i :arr){
            System.out.println(i);
        }
    }

}
