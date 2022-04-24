package com.soumyadeep;

public class RotationCount {
    public static void main(String[] args) {
        //(3/3) +1 Grace
        int[] arr={3,4,5,6,1,2};
        System.out.println(pivot(arr)+1);
    }
    static int pivot(int[] arr){
        if(arr[0]<=arr[arr.length-1])
            return arr.length-1;
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                return mid;
            if(arr[mid]<arr[mid-1])
                return mid-1;
            if(start<end && arr[start]<arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}
