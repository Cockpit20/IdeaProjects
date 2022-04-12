package com.soumyadeep;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {
        int sum=0;
        int n= mat.length;
        for (int i = 0; i < mat.length; i++) {
            sum=sum+mat[i][i];
            sum=sum+mat[i][n-i-1];
        }
        if(mat.length%2!=0)
            sum=sum-mat[n/2][n/2];
        return sum;
    }
}
