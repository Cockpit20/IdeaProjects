package com.soumyadeep;

public class Main {

    public static void main(String[] args) {
	// write your code here (1/1)
        int n=8;
        System.out.println(fib(n));
    }
    static int fib(int n){
        return (int) ((1/Math.sqrt(5))*Math.pow(((1+Math.sqrt(5))/2),n)-(1/Math.sqrt(5))*Math.pow(((1-Math.sqrt(5))/2),n));
    }
}
