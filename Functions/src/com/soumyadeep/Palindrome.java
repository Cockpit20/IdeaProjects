package com.soumyadeep;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
//        System.out.print("Enter a number:");
//        int n= input.nextInt();
        for (int i = 100; i <1000 ; i++) {
            if(palindrome(i)){
                System.out.println(i);
            }
        }

    }
    static boolean palindrome(int i) {

        int b=i;
        int digit,s=0;
        while(b>0)
        {
            digit=b%10;
            s=s+digit*digit*digit; //ARMSTRONG NUMBER
            //s=s*10+digit;
            b=b/10;
        }
        return i==s;
    }
}
