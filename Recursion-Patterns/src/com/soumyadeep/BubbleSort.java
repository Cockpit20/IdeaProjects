package com.soumyadeep;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={3,1,5,2,4};
        bubbleSort2(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = 1; j <= arr.length-i-1; j++) {
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
            }
        }
    }

    static void bubbleSort2(int[] arr,int r,int c){
        if(r==0)
            return;
        if(c<r){
            if(arr[c]>arr[c+1])
                swap(arr, c, c + 1);
            bubbleSort2(arr, r, c + 1);
        }else{
            bubbleSort2(arr,r-1,0);
        }

    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
