package cn.leetcode.www;

public class a11 {
    public int maxArea(int[] height) {
        int x=0;
        int y=height.length-1;
        int nowLength = 0;
        while (x!=y){
            nowLength = Math.max(Math.min(height[x],height[y])*(y-x),nowLength);
            if (height[x]>=height[y]){
                y--;
            }
            else {
                x++;
            }
            // nowLength = min(height[x],height[y])*(y-x);
        }
        return nowLength;
    }
}
