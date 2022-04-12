package com.soumyadeep;

public class Fibonacci {

    public static void main(String[] args) {
	int n=50;
        System.out.println("Term "+n+" of fibonacci series is "+fib_formula(n));
    }
    static int fib_formula (int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
    static int fib_recursive(int n) {
        if(n==0||n==1)
            return n;
        else
            return fib_recursive(n-1)+fib_recursive(n-2);
    }
}
