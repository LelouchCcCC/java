package cn.leetcode.www;

public class Swap {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int[] x= {10, 20};
        swap(a,b);
        System.out.printf("%d,%d",a,b);
        System.out.println();
        swap2(x);
        System.out.printf("%d,%d",x[0],x[1]);
    }
    public static void swap(int a, int b){
        int t=a;
        a=b;
        b=t;
    }
    public static void swap2(int[] x){
        int t=x[0];
        x[0]=x[1];
        x[1]=t;
    }
}
