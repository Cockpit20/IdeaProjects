package com.soumyadeep;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=input.nextInt();
        int b=n;
        int digit;
        int s=0;
        while (b>0) {
            digit = b % 10;
            s=s*10+digit;
            b = b / 10;
        }
        System.out.println("Reverse of "+n+" is "+s);
    }
}

