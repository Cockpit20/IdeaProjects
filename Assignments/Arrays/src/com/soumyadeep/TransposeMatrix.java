package com.soumyadeep;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat={
                {1,2,3},
                {4,5,6}
        };
        System.out.println(Arrays.deepToString(transpose(mat)));
    }

    static int[][] transpose(int[][] mat) {
        int newRows = mat.length;
        int newColumns = mat[0].length;
        int[][] ans = new int[newColumns][newRows];
        for (int rows = 0; rows < newRows; ++rows)
            for (int columns = 0; columns < newColumns; ++columns)
            {
                ans[columns][rows] = mat[rows][columns];
            }
        return ans;
    }

}
