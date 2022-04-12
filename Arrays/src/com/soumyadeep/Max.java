package com.soumyadeep;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        int l=max(arr);
        System.out.println("The largest number is "+l);
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));
    }
    static int max(int[] arr)
    {
        int max=0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}

