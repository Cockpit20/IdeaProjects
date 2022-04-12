package com.soumyadeep;

public class SearchInRotatedArray
//Find Pivot(The largest number in the sorted array)
    //Search in first half (0,pivot)
    //Search in second half (pivot+1,n.length-1)
{
    public static void main(String[] args) {
        int[] n = {3, 1};
        int target = 1;
        System.out.println(search(n,target));
    }
    static int search(int[] n, int target){
        int pivot=pivot(n);
        int firstTry=binarySearch(n,target,0,pivot);
        int secondTry=binarySearch(n,target,pivot+1,n.length-1);
        if (firstTry!=-1)
            return firstTry;
        else
            return secondTry;
    }
    static int pivot(int[] n) {
        int max=n[0];
        int maxIndex=0;
        for (int i = 0; i < n.length-1; i++) {
            if (n[i]>max){
                max=n[i];
                maxIndex=i;
            }
        }
        return maxIndex;
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

