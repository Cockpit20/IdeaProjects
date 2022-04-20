package com.soumyadeep;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={3,1,5,2,4};
        selectionSort2(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i <= arr.length-2 ; i++) {
            int lastIndex= arr.length-i-1;
            int maxIndex=findMax(arr,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }

    static void selectionSort2(int[] arr,int r,int c,int max){
        if(r==0)
            return;
        if(c<r){
            if(arr[c]>arr[max])
                selectionSort2(arr, r, c + 1,c);
            else
                selectionSort2(arr,r,c+1,max);
        }else{
            swap(arr,max,r-1);
            selectionSort2(arr,r-1,0,0);
        }

    }

    static int findMax(int[] arr, int lastIndex) {
        int max=arr[0];
        int maxIndex=0;
        for (int i = 0; i <= lastIndex; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
