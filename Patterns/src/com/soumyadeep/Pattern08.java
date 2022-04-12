package com.soumyadeep;

import java.util.Scanner;

public class Pattern08 {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            //Pattern08
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j += 1) {
//                System.out.print("*");
//            }
//            System.out.println();
            //PATTERN09
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n-i) + 1; j += 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
