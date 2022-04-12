package com.soumyadeep;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int[] n={2,4,6,9,11,12,14,20,36,48};
        int target=4;
        System.out.println(binarySearch(n,target));

    }
    static int binarySearch(int[] n,int target)
    {
        int start=0;
        int end=n.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if (target<n[mid])
                end=mid-1;
            else if (target>n[mid])
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
