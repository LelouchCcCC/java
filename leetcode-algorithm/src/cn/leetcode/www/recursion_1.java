package cn.leetcode.www;

public class recursion_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(recur(arr,0));
    }

    private static int recur(int[] arr,int n) {
        if (n==arr.length){
            return 0;
        }
        return recur(arr, n+1)+arr[n];
    }


}
