package com.soumyadeep;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=0;
        int b=1;
        int c;
//        int c;
//        System.out.print(a+" "+b+" ");
//        for (int i=1;i<=n;i++)
//        {
//            c=a+b;
//            System.out.print(c+" ");
//            a=b;
//            b=c;
        int i=2;
        while (i<=n){
            int temp=b;
            b=b+a;
            a=temp;
            i++;
        }
        System.out.println(b);
    }
}
