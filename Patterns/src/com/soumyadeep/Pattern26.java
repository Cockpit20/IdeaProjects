package com.soumyadeep;

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}