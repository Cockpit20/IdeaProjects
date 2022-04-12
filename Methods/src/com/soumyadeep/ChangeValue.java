package com.soumyadeep;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //CALL BY VALUE
        int[] arr={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] n)
    {
        n[0]=99;
    }
}
