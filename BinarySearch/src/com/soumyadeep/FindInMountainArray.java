package com.soumyadeep;

public class FindInMountainArray {
    public static void main(String[] args) {
        // write your code here
        int[] n={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(search(n,target));

    }
    static int search(int[] n, int target){
        int peak=peakIndex(n);
        int firstTry=binarySearch(n,target,0,peak);
        int secondTry=binarySearch(n,target,peak,n.length-1);
        if (firstTry!=-1)
        return firstTry;
        else return secondTry;
    }
    static int peakIndex(int[] n) {
        int start = 0;
        int end = n.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (n[mid] > n[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
    static int binarySearch(int[] n,int target,int start, int end)
    {
        if (n[start]<=n[end])
        {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < n[mid])
                    end = mid - 1;
                else if (target > n[mid])
                    start = mid + 1;
                else
                    return mid;
            }
        }
        else if (n[start]>=n[end])
        {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > n[mid])
                    end = mid - 1;
                else if (target < n[mid])
                    start = mid + 1;
                else
                    return mid;
            }
        }
        return -1;
    }
}
