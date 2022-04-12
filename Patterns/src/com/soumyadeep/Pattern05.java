package com.soumyadeep;

import java.util.Scanner;

public class Pattern05 {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
//            if (i <= n) {
//                for (int j = 1; j <=i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }else
//            {
//                for (int j = 1; j <=2*n-i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
            int c=i<=n?i:2*n-i;
            for (int j = 1; j <=c; j++) {
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
}

