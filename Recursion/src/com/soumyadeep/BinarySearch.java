package com.soumyadeep;

public class BinarySearch {
    public static void main(String[] args) {
        //Recurrence relation : F(N)=0(1)+F(N/2)
    int[] arr={12,23,64,65,68,98};
    int target=23;
    int start=0;
    int end= arr.length-1;
        System.out.println(search(arr,target,start,end));
        //Types of recurrence relation:
        //1.Linear Recurrence Relation
        //2.Divide and conquer Recurrence Relation
    }
    static int search(int[] arr, int target,int start, int end)
    {
        if(start>end)
            return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
            return mid;
        if(target>arr[mid])
            return search(arr, target,mid+1,end);
        else
            return search(arr, target,start,mid-1);
    }
}
