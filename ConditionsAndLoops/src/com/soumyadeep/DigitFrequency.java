package com.soumyadeep;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=input.nextInt();
        int b=n;
        System.out.println("Enter the digit: ");
        int digit1= input.nextInt();
        int digit;
        int c=0;
        while (b>0) {
            digit = b % 10;
            if (digit == digit1)
                c = c + 1;
            b = b / 10;
        }
        System.out.println("Digit frequency of "+digit1+" in "+n+" is "+c);
    }
}
