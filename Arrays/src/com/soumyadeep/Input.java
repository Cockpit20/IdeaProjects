package com.soumyadeep;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=233;
        arr[3]=543;
        arr[4]=3;
        System.out.println(arr[3]);

        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int j : arr) {
            System.out.print(j + " ");
        }

        //String Arrays
        System.out.println();
        String[] str=new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
        str[0]="Chandra";
        System.out.println(Arrays.toString(str));

    }
}
