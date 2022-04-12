package com.soumyadeep;

import java.util.Arrays;

public class SmallerNumber {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int c=0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]<nums[i]&&j!=i)
                    c++;
            }
            ans[i]=c;
        }
        return ans;
    }
}
