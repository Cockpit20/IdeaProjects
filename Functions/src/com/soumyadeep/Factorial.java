package com.soumyadeep;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= input.nextInt();
        int fa=factorial(n);
        System.out.println("Factorial of "+n+" is "+fa);
    }
    static int factorial(int n) {
        int f=1;
        for (int i = 1; i <=n ; i++) {
            f=f*i;
        }
        return f;
    }
}
