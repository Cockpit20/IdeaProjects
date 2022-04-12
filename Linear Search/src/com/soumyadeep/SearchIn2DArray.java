package com.soumyadeep;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] n= {
                {69, 101, 786},
                {911, 407, 1508},
                {-273, 42, -373, 153}
            };
        int target=407;
        int[] index=Search(n,target);
        boolean ans=linearSearch(n,target);
        if (!ans)
            System.out.println("Not Found");
        else
            System.out.println("Found at "+ Arrays.toString(index));
        int min=MINIMUM(n);
        int max=MAXIMUM(n);
        System.out.println("Minimum="+min);
        System.out.println("Maximum="+max);

//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
    }
    static int MINIMUM(int[][] arr)
    {
        int min=Integer.MAX_VALUE;
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                if (anInt < min)
                    min = anInt;
            }
        }
        return min;
    }
    static int MAXIMUM(int[][] arr)
    {
        int max=Integer.MIN_VALUE;
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                if (anInt > max)
                    max = anInt;
            }
        }
        return max;
    }
    static boolean linearSearch(int[][] arr,int target)
    {
        if (arr.length==0){
            return false;
        }
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element == target)
                    return true;
            }
        }
        return false;
    }
    static int[] Search(int[][] arr,int target)
    {
        if (arr.length==0){
            return new int[]{-1,-1};
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++) {
                int element=arr[i][j];
                if (element==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}



