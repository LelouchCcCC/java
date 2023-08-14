package cn.leetcode.www;

import java.util.ArrayList;
import java.util.List;

public class a15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        quickSort(nums,0,len-1);
        int pre = 100001;
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        for (int i=0;i<len-1;i++){
            int x = nums[i];
            if (pre == x){
                continue;
            }
            int a1 = i+1;
            int a2 = len-1;
            while(a1<a2){
                while((nums[a2]+nums[a1]+x)>0 && a1<a2){
                    a2--;
                }
                while((nums[a2]+nums[a1]+x)<0 && a1<a2){
                    a1++;
                }
                if ((nums[a2]+nums[a1]+x)==0 && a1<a2){
                    List<Integer> li = new ArrayList<>();
                    li.add(x);
                    li.add(nums[a1]);
                    li.add(nums[a2]);
                    if (list.size()!=0) {
                        if (!list.get(list.size()-1).equals(li)) {
                            list.add(li);
                            System.out.println(li);
                        }
                    } else if (list.size() ==0) {
                        list.add(li);
                        System.out.println(li);
                    }
                    a2--;
                    a1++;
                }
            }
            pre = x;
        }
        return list;
    }
    public void quickSort(int[] nums, int start, int end){
        if (start>=end){
            return;
        }
        int k = nums[start];
        int i = start,j=end;
        while (i<j){
            while(i<j && k<=nums[j]){
                j--;
            }
            swap(nums,i,j);
            while(i<j && k>=nums[i]){
                i++;
            }
            swap(nums,i,j);
        }
        quickSort(nums,start,j-1);
        quickSort(nums,i+1,end);
    }
    public void swap(int[] nums, int i, int j){
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
