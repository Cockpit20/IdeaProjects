package com.soumyadeep;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans=sum3(20,30);
        System.out.println(ans);
    }
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }
    static int sum2()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n1=input.nextInt();
        System.out.print("Enter number2: ");
        int n2=input.nextInt();
        int sum=n1+n2;
        return sum;
    }
    static void sum()
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n1=input.nextInt();
        System.out.print("Enter number2: ");
        int n2=input.nextInt();
        int sum=n1+n2;
        System.out.println("The sum is "+sum);
    }
}
