package com.soumyadeep;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] n={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target=15;
        System.out.println(Arrays.toString(rowColumnSearch(n,target)));
    }

    static int[] linearSearch(int[][] n,int target) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }

    static int[] rowColumnSearch(int[][] n,int target){
        int row=0;
        int column=n.length-1;
        while(row<n.length&&column>=0){
            if (n[row][column]==target)
                return new int[]{row,column};
            if (n[row][column]<target)
                row++;
            else
                column--;
        }
        return new int[]{-1,-1};
    }
}
