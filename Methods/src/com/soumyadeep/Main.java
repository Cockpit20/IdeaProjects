package com.soumyadeep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n1=input.nextInt();
        System.out.print("Enter number2: ");
        int n2=input.nextInt();
        int sum=n1+n2;
        System.out.println("The sum is "+sum);
    }
}
