package com.soumyadeep;

import java.util.Scanner;

public class Pattern18 {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 2 * n ; i++) {
            int c = i <= n ? n - i+1 : i - n;
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            int space = i <= n ? 2*i-2 : 4 * n - 2*i;
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
