package com.soumyadeep;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] n = {3, 4, 5, 12};
        System.out.println(Arrays.toString(n));
        change(n);
        System.out.println(Arrays.toString(n));
    }

    static void change(int[] arr)
    {
        arr[0]=99;
    }
}
