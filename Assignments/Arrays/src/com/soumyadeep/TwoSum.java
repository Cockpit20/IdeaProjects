package com.soumyadeep;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,1,1};
        int target=2;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] ans=new int[]{-1,-1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]+nums[j]==target && i!=j)
                    return new int[]{i+1,j+1};
            }
        }
        return ans;
    }
}
