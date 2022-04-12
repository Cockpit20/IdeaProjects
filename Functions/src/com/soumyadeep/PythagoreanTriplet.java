package com.soumyadeep;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {

        String p=null;
        String pt=pythagoreanTriplet(p);
        System.out.println("The numbers are "+pt);
    }
    static String pythagoreanTriplet(String value) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number 1:");
        int n1= input.nextInt();
        System.out.print("Enter number 2:");
        int n2= input.nextInt();
        System.out.print("Enter number 3:");
        int n3= input.nextInt();
        if(n1*n1+n2*n2==n3*n3||n3*n3+n2*n2==n1*n1||n1*n1+n3*n3==n2*n2)
            value="Pythagorean Triplet";
        else
            value="not Pythagorean Triplet";
        return value;
    }
}

