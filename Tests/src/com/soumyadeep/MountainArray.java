package com.soumyadeep;

public class MountainArray {
    public static void main(String[] args) {
        //(3/3)+1 Grace
        int[] arr={11,20,42,69,53,45};
        int target=42;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr,int target){
        int pI=peakIndex(arr);
        if(arr[pI]==target)
            return pI;
        int firstTry=binarySearch(arr,0,pI-1,target);
        int secondTry=binarySearch(arr,pI+1,arr.length-1,target);
        if(firstTry==-1)
            return secondTry;
        return firstTry;
    }

    static int peakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                end=mid-1;
            else
                start=mid+1;
        }
        return start;
    }

    static int binarySearch(int[] arr,int start,int end,int target){
        if(arr[start]<=arr[end]){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target)
                    return mid;
                if(target>arr[mid])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }else{
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target)
                    return mid;
                if(target>arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return -1;
    }


}


