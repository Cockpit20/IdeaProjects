package com.soumyadeep;

import java.util.Scanner;

public class NaturalNoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n = input.nextInt();
//        int s=0;
//        for (int i = 1; i <=n ; i++) {
//            s=s+i;
//        }
        int s=sum(n);
        System.out.println("Sum of first "+n+" natural numbers is "+s);
    }
     static int sum(int n) {
         int s=n*(n+1)/2;
         return s;
    }
}
