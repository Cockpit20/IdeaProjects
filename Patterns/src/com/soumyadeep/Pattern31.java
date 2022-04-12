package com.soumyadeep;

import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <=2*n-1 ; j++) {
                int index=n-Math.min(Math.min(Math.min(i-1,j-1),2*n-j-1),2*n-i-1);
                System.out.print(index+" ");
            }
            System.out.println();
        }
    }
}
