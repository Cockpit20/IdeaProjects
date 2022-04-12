package com.soumyadeep;

import java.util.Scanner;

public class Prime2 {

    public static void main(String[] args) {
        // write your code here
        int n1,n2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first limit: ");
        n1 = input.nextInt();
        System.out.print("Enter last limit: ");
        n2 = input.nextInt();
        System.out.println("PrimeNos. between the range:");
        for (int i = n1; i <=n2 ; i++) {
            if (isPrime(i))
                System.out.print(i+" ");
        }
    }
    static boolean isPrime(int n){
        int c=0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0)
                c=c+1;
        }
        return c==2;
    }
}

