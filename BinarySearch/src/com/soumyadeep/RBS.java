package com.soumyadeep;

public class RBS {
    public static void main(String[] args) {
        int[] n = {3,4,5,6,1,2};
        int target = 2;
        System.out.println(search(n,target));
    }
    static int search(int[] n, int target){
        int pivot=pivot(n);
        if (pivot==-1)
            return binarySearch(n,target,0,n.length-1);
        if (n[pivot]==target)
            return pivot;
        if (target>=n[0])
                return binarySearch(n,target,0,pivot-1);
        return binarySearch(n,target,pivot+1,n.length-1);
    }
    static int pivot(int[] n) {
        int start=0;
        int end=n.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mid < end && n[mid]>n[mid+1])
                return mid;
            if (mid > start && n[mid]<n[mid-1])
                return mid-1;
            if (n[mid]<=n[start])
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    static int binarySearch(int[] n,int target,int start, int end)
    {
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
