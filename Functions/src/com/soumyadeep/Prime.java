package com.soumyadeep;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // write your code here
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        boolean ans=prime(n);
        System.out.println(ans);
    }
    static boolean prime(int n){

        int c=0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0)
                c=c+1;
        }
        return c==2;
    }
}
