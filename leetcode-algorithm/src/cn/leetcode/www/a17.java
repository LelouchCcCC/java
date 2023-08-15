package cn.leetcode.www;
import java.util.List;
import java.util.ArrayList;
public class a17 {
    public static void main(String[] args) {
        letterCombinations("238");
    }
    public static List<String> letterCombinations(String digits) {
        String[] str = new String[10];
        str[2] = "abc";
        str[3] = "def";
        str[4] = "ghi";
        str[5] = "jkl";
        str[6] = "mno";
        str[7] = "pqrs";
        str[8] = "tuv";
        str[9] = "wxyz";
        List<String> list = new ArrayList<String>();
        backTracking(list,str,digits);
        return list;
    }
    public static void backTracking(List<String> list, String[] str, String digits){
        if (digits.length()==0){
            return;
        }
        char d = digits.charAt(0);
        int len = list.size();
        if (len == 0){
            for (int i=0;i<str[d-'0'].length();i++){
                list.add(""+str[d-'0'].charAt(i));
            }
        }
        else{
//            System.out.println(str[d-'0'].length());
            for (int i=0;i<str[d-'0'].length();i++){
                char c = str[d-'0'].charAt(i);
                for (int j=0;j<len;j++){
                    // System.out.println(list.get(j));
                    list.add(list.get(j)+c);
                }
            }
            for (int i=0;i<len;i++){
                list.remove(0);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        backTracking(list,str,digits.substring(1));
    }
}
