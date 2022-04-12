package com.soumyadeep;

import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        // write your code here
//        Scanner input = new Scanner(System.in);
//        int n = input.next().trim().charAt(0);
        //PATTERN 32
//        for (char i = 'E'; i >= 'A'; i--) {
//            for (char j =i; j <='E' ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
        //PATTERN 34
//        for (char i = 'E'; i >= 'A'; i--) {
//            for (char j =i; j >='A' ; j--) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
        //PATTERN33
//        char ch='a';
//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(ch+" ");
//                if (ch%2!=0)
//                    ch-=32;
//                else
//                    ch+=32;
//                ch++;
//            }
//            System.out.println();
        //PATTERN21
//        int n=1;
//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(n+"\t");
//                n++;
//            }
//            System.out.println();
        //PATTERN 22
        int n;
        for (int i = 1; i <=5 ; i++) {
            if(i%2==0)
                n=0;
            else
                n=1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(n+"\t");
                if(n==1)
                    n=0;
                else
                    n=1;
            }
            System.out.println();
        }
    }
}
