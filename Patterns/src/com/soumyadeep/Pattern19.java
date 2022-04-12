package com.soumyadeep;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 2 * n-1; i++) {
            int c = i <= n ? i : 2 * n-i;
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            int space = i <= n ? 2*(n-i) :2*(i-n) ;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
