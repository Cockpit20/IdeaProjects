package com.soumyadeep;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            int space=i<=n?n-i:i-n; PATTERN28
//            for (int j = 1; j <=i-1; j++) { PATTERN 11
//                System.out.print(" ");
//            }
//            int c=i<=n?i:2*n-i; PATTERN 28
//            for (int j = 1; j <=n-i+1; j++) { PATTERN 11
//                System.out.print("* ");
//            }
//            System.out.println();
        //PATTERN 12
        for (int i = 1; i <=2*n ; i++) {
            int space=i<=n?i-1:2*n-i;
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }
            int c=i<=n?n+1-i:i-n;
            for (int j = 1; j <=c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


