package com.soumyadeep;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any value except 0: ");
        int n= input.nextInt();
        int sn=0,so=0,se=0;
        while (n!=0){
            System.out.print("Enter an integer:");
            n= input.nextInt();
            if (n<0)
                sn=sn+n;
            else if (n>0&&n%2==0)
                se=se+n;
            else if (n>0&&n%2!=0)
                so=so+n;
        }
        System.out.println("Sum of negative numbers: "+sn);
        System.out.println("Sum of positive even numbers: "+se);
        System.out.println("Sum of positive odd numbers: "+so);
    }
}
