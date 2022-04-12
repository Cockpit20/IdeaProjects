package com.soumyadeep;

import java.util.Arrays;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] image={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.toString(flipImage(image)));
    }

    static int[][] flipImage(int[][] image) {
        int[][] ans=new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j]==1)
                    ans[i][image.length-1-j]=0;
                else
                    ans[i][image.length-1-j]=1;
            }
        }
        return ans;
    }
}
