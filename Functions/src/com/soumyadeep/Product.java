package com.soumyadeep;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number 1:");
        int n1=input.nextInt();
        System.out.print("Enter number 2:");
        int n2=input.nextInt();
        int su=sum(n1,n2);
        int pr=product(n1,n2);
        System.out.println("Product="+pr);
        System.out.println("Sum="+su);
    }

    static int product(int n1,int n2) {
        int p=n1*n2;
        return p;
    }

    static int sum(int n1,int n2) {
        int s=n1+n2;
        return s;
    }
}
