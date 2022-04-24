package com.soumyadeep;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
//        (12/16)
        int[] arr={3,1,5,2,4};
//        bubbleSort(arr, arr.length-1, 0);
//        System.out.println(Arrays.toString(arr));

//        selectionSort(arr, arr.length-1,0,0 );
//        System.out.println(Arrays.toString(arr));

//        mergeSort(arr,0, arr.length);
//        System.out.println(Arrays.toString(arr));

        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int row,int col){
        if(row==0)
            return;
        if(col<row){
            if(arr[col]>arr[col+1])
                swap(arr,col,col+1);
            bubbleSort(arr,row,col+1);
        }else{
            bubbleSort(arr,row-1,0);
        }
    }

    static void selectionSort(int[] arr,int row,int col,int max){
        if(row==0)
            return;
        if(col<row){
            if(arr[col]>arr[max])
                selectionSort(arr,row,col+1,col);
            else
                selectionSort(arr,row,col+1,max);
        }else{
            swap(arr,max,row);
            selectionSort(arr,row-1,0,0);
        }
    }

    static void mergeSort(int[] arr, int start, int end){
        if(end-start==1)
            return ;
        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        merge(arr,start,mid,end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix =new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;

        }
        while(i<mid){
            mix[k]=arr[i];
            i++;k++;
        }
        while(j<end){
            mix[k]=arr[j];
            j++;k++;
        }
        for (int l = 0; l < k ; l++) {
            arr[start+l]=mix[l];
        }
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
            while(arr[end]>pivot)
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

    static void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
