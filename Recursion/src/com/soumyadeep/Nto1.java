package com.soumyadeep;

public class Nto1 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    static void function(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        function(n-1);
    }

    static void functionRev(int n) {
        if(n==0) {
            return;
        }
        functionRev(n-1);
        System.out.println(n);
    }

    static void functionBoth(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        functionBoth(n-1);
        System.out.println(n);
    }

    static int factorial(int n){
        if(n==0||n==1)
            return 1;
        return n*factorial(n-1);
    }

    static int sum(int n){
        if(n==1)
            return 1;
        return n+sum(n-1);
    }

}
