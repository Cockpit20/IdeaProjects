package com.soumyadeep;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        // write your code here
        //PATTERN25
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }if(i==1||i==n)
                for (int j = 1; j <=n ; j++) {
                    System.out.print("* ");
                }
            else
            {
                System.out.print("*");
                for (int j = 1; j <=2*n-3 ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
