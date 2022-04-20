package com.soumyadeep;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={58,28,7,26,4,31,63};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr,int low,int high){
        if(low>=high)
            return;
        int start=low;
        int end=high;
        int mid=(start+end)/2;
        int pivot=arr[mid];
        while(start<=end){
            while(arr[start]<pivot)
                start++;
            while (arr[end]>pivot)
                end--;
            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
