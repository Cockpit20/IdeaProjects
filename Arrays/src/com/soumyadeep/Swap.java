package com.soumyadeep;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,12,18};
//        swap(arr,1,3);
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr)
    {
        int start=0;
        int end= arr.length-1;
        while (start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
