package com.soumyadeep;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        // write your code here
        int[] n={2,4,6,9,11,11,11,20,36,48};
        int target=11;
        System.out.println(Arrays.toString(binarySearch(n,target)));

    }
    public static int[] binarySearch(int[] n, int target)
    {
        int[] ans={-1,-1};
        int start=search(n,target,true);
        int end=search(n,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
     static int search(int[] n, int target, boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=n.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if (target<n[mid])
                end=mid-1;
            else if (target>n[mid])
                start=mid+1;
            else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
