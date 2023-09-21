package cn.leetcode.www;

public class countBits {
    public static void main(String[] args) {
        int num=9;
        int[] result = new int[num +1];
        for (int i=0;i<=num;++i){
            int j=i;
            while (j!=0){
                result[i]++;
                System.out.println(j);
                j = j & (j-1);
            }
        }
        System.out.println("result:");
        for (int i:result){
            System.out.println(i);
        }
    }
}
