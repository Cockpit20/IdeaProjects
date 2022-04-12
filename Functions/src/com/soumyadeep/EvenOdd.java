package com.soumyadeep;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // write your code here
        String type = null;
        String eo=evenodd(type);
        System.out.println("The number is "+eo);
    }
    static String evenodd(String type){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        if (n%2==0)
            type="Even";
        else
            type="Odd";
        return type;
    }
}
