package com.soumyadeep;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter radius:");
        int r=input.nextInt();
        double ar=area(r);
        double ci=circumference(r);
        System.out.println("Circumference="+ci);
        System.out.println("Area="+ar);
    }

    static double circumference(float r) {
        double c=2*3.14*r;
        return c;
    }

    static double area(float r) {
        double a=3.14*r*r;
        return a;
    }
}

