package com.soumyadeep;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int image[][]={
                {1,0,1},
                {1,0,1},
                {0,0,0}
        };
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                image[i][j]=image[i][j]^1; //0^1=1 and 1^1=0
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(image[i][j]+"\t");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));


    }
    static int[][] flipAndInvertImage(int[][] image){
        for(int[] row: image){
            for (int i = 0; i < (image[0].length+1)/2; i++) {
                int temp=row[i]^1;
                row[i]=row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp;
            }
        }
        return image;
    }
}
