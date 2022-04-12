package com.soumyadeep;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n= nums.length/2;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j=0;
        for (int i = 0; i < nums.length; i+=2) {
            ans[i]=nums[j];
            ans[i+1]=nums[j+n];
            j++;
        }
        return ans;
    }
}
