package com.soumyadeep;

public class IsPrimeNumber {

    public static void main(String[] args) {
	// write your code here
        int n=40;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i))
                System.out.print(i+" ");
        }
    }
    static boolean isPrime(int n){
        if(n<2)
            return false;
        for (int i = 2; i <= (int)Math.sqrt(n) ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
