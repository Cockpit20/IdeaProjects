package com.soumyadeep;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][4];
//        int[][] n={
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= in.nextInt();
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
