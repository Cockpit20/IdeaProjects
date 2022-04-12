package com.soumyadeep;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
	// write your code here
        int n1,n2,n3;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        n1=input.nextInt();
        System.out.print("Enter number 2: ");
        n2=input.nextInt();
        System.out.print("Enter number 3: ");
        n3=input.nextInt();
        int maximum=max(n1,n2,n3);
        int minimum=min(n1,n2,n3);
        System.out.println("Maximum is "+maximum);
        System.out.println("Minimum is "+minimum);
    }
    static int max(int n1,int n2,int n3){

        int max=n1;
        if (n2>max)
            max=n2;
        if (n3>max)
            max=n3;
        return max;
    }
    static int min(int n1,int n2,int n3){

        int min=n1;
        if (n2<min)
            min=n2;
        if (n3<min)
            min=n3;
        return min;
    }
}
