package cn.leetcode.www;

public class a12 {
    public String intToRoman(int num) {
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String ss = "";
        String[] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for (int i=0;i<arr.length;i++){
            int count = num/arr[i];
            for (int j=0;j<count;j++){
                ss+=str[i];
            }
            num = num%arr[i];
        }
        return ss;
    }
}
