package com.soumyadeep;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= i - n; j++) {
                    System.out.print("  ");
                }
                for (int j = 2*n-i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= 2*n-i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}

